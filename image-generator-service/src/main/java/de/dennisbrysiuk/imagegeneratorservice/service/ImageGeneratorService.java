package de.dennisbrysiuk.imagegeneratorservice.service;

import de.dennisbrysiuk.imagegeneratorservice.model.GenerateImageRequest;
import de.dennisbrysiuk.imagegeneratorservice.model.GenerateImageResponse;

/**
 * @author DennisBrysiuk
 */
public interface ImageGeneratorService {

    GenerateImageResponse generateImage(GenerateImageRequest generateImageRequest);

}
