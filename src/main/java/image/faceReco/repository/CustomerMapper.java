package image.faceReco.repository;

import image.faceReco.domain.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    List<Customer> findByUserId(String userId);
    void save(Customer customer);
}
