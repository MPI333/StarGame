package ru.gb.utils;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Regions {

    public static TextureRegion[] split(TextureRegion region, int rows, int cols, int frames) {
        if (region == null) {
            throw new RuntimeException("Split null exception!");
        }
        TextureRegion[] regions = new TextureRegion[frames];
        int tileWidth = region.getRegionWidth() / cols;
        int tileHeight =  region.getRegionHeight() / rows;

        int frame = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                regions[frame] = new TextureRegion(region, tileWidth * c, tileHeight * r, tileWidth, tileHeight);
                if (frame == frames - 1) {
                    return regions;
                }
            }
        }

        return regions;
    }

}
