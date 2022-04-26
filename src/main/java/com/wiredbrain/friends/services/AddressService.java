package com.wiredbrain.friends.services;

import com.wiredbrain.friends.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressService extends CrudRepository<Address, Integer> {

}
