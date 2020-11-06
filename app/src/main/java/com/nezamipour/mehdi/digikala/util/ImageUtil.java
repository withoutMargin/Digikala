package com.nezamipour.mehdi.digikala.util;

import android.net.Uri;

import com.nezamipour.mehdi.digikala.data.model.product.Image;
import com.nezamipour.mehdi.digikala.data.model.product.Product;

import java.util.List;

public class ImageUtil {

    public static String getFirstImageUrlOfProduct(Product product) {
        List<Image> images = product.getImages();
        if (images != null && !images.isEmpty())
            return images.get(0).getSrc();
        else
            throw new NullPointerException("this product doesn't have any images");
    }

    public static String convertResourceIdToUrl(int resourceId) {
        return Uri.parse("android.resource://com.nezamipour.mehdi.digikala/" + resourceId).toString();
    }
}
