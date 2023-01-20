package de.dennisbrysiuk.imagegeneratorservice.model;

import lombok.Data;

import java.util.List;

/**
 * @author DennisBrysiuk
 */
@Data
public class GenerateImageResponse {

    private List<GeneratedImage> data;

}
