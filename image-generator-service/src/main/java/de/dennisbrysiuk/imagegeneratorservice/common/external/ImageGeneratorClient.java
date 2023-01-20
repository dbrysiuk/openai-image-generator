package de.dennisbrysiuk.imagegeneratorservice.common.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import de.dennisbrysiuk.imagegeneratorservice.config.ImageGeneratorConfig;
import de.dennisbrysiuk.imagegeneratorservice.model.GenerateImageRequest;
import de.dennisbrysiuk.imagegeneratorservice.model.GenerateImageResponse;

/**
 * @author DennisBrysiuk
 */
@FeignClient(name = "imageGenerator", url = "${openai.image-generator.url}", configuration = ImageGeneratorConfig.class)
public interface ImageGeneratorClient {

    @PostMapping(value = "/v1/images/generations")
    GenerateImageResponse generateImage(@RequestBody final GenerateImageRequest request);

}
