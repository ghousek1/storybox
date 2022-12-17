package com.ghouse.storybox.repo;

import com.ghouse.storybox.entity.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends MongoRepository<Profile,String> {
}
