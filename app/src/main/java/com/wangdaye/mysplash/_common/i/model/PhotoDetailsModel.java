package com.wangdaye.mysplash._common.i.model;

import com.wangdaye.mysplash._common.data.data.Photo;
import com.wangdaye.mysplash._common.data.data.PhotoDetails;
import com.wangdaye.mysplash._common.data.service.PhotoService;

/**
 * Photo details model.
 * */

public interface PhotoDetailsModel {

    PhotoService getService();

    Photo getPhoto();
    void setPhoto(Photo p);

    PhotoDetails getPhotoDetails();
    void setPhotoDetails(PhotoDetails details);
}
