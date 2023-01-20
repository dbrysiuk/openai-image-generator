package de.dennisbrysiuk.imagegeneratorservice.service;

import org.springframework.stereotype.Service;

import de.dennisbrysiuk.imagegeneratorservice.common.external.ImageGeneratorClient;
import de.dennisbrysiuk.imagegeneratorservice.model.GenerateImageRequest;
import de.dennisbrysiuk.imagegeneratorservice.model.GenerateImageResponse;
import lombok.AllArgsConstructor;

/**
 * @author DennisBrysiuk
 */

@Service
@AllArgsConstructor
public class ImageGeneratorServiceImpl implements ImageGeneratorService {

    private final ImageGeneratorClient imageGeneratorClient;

    public GenerateImageResponse generateImage(final GenerateImageRequest request) {
        final GenerateImageResponse response = imageGeneratorClient.generateImage(request);
        // if necessary, the response can be further processed here

        return response;
    }

}
