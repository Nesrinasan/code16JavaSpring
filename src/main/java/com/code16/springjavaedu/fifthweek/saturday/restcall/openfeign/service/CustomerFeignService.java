package com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.service;

import com.code16.springjavaedu.fifthweek.saturday.myexception.UserException;
import com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.caller.RapidFeignCaller;
import com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.model.Customer;
import com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.repository.CustomerRepository;
import com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.dto.SaveCustomerRequestDto;
import com.code16.springjavaedu.fifthweek.saturday.restcall.resttemplate.dto.VerifyPhoneResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerFeignService {

	private final RapidFeignCaller rapidFeignCaller;

	private final CustomerRepository customerRepository;

	@Transactional
	public void save(SaveCustomerRequestDto saveCustomerRequestDto) {
		String name = saveCustomerRequestDto.name();
		String phoneNumber = saveCustomerRequestDto.phoneNumber();

		if (!validatePhoneNumber(phoneNumber)) {
			throw new UserException("Kullanıcının telefon numarası hatalı.");
		}

		Customer customer = new Customer();
		customer.setName(name);
		customer.setPhoneNumber(phoneNumber);
		customer.setActive(false);
		customerRepository.save(customer);

		sendMail(customer);

	}

	private void sendMail(Customer customer) {
		System.out.println("send mail");
		String s = null;
		s.equals("");

	}

	private boolean validatePhoneNumber(String phoneNumber) {

		VerifyPhoneResponseDto verifyPhoneResponseDto = rapidFeignCaller.verifyPhoneNumber("veriphone.p.rapidapi.com", "e7573b8dfamsh06db1ee333752fbp1e2a0ajsn67ca8fb7fe8d", phoneNumber);

		return verifyPhoneResponseDto.isPhone_valid();
	}

}
