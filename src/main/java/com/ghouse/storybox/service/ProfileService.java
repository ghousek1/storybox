package com.ghouse.storybox.service;

import com.ghouse.storybox.entity.Profile;

import java.util.List;

public interface ProfileService {
    List<String> getProfilePermissions(String userName);

    Profile addProfile(Profile profile);
}
