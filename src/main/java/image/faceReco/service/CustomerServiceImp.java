package image.faceReco.service;

import image.faceReco.domain.Customer;
import image.faceReco.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImp implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public List<Customer> findByUserId(String userId) {
        return customerRepository.findByUserId(userId);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}