package com.shareimage.Repository;

import com.shareimage.models.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User,String> {
}
