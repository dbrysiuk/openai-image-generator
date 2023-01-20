package de.dennisbrysiuk.imagegeneratorservice.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import de.dennisbrysiuk.imagegeneratorservice.common.util.ValidSize;
import lombok.Data;

/**
 * @author DennisBrysiuk
 */
@Data
public class GenerateImageRequest {

    @NotBlank
    private String prompt;

    @ValidSize
    private String size;

    @Min(1)
    @Max(10)
    private int numberOfImages;

}
