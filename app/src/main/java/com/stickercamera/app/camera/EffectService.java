package com.stickercamera.app.camera;

import com.stickercamera.app.camera.effect.FilterEffect;
import com.stickercamera.app.camera.util.GPUImageFilterTools;

import java.util.ArrayList;
import java.util.List;


public class EffectService {

    private static EffectService mInstance;

    public static EffectService getInst() {
        if (mInstance == null) {
            synchronized (EffectService.class) {
                if (mInstance == null)
                    mInstance = new EffectService();
            }
        }
        return mInstance;
    }

    private EffectService() {
    }

    public List<FilterEffect> getLocalFilters() {
        List<FilterEffect> filters = new ArrayList<FilterEffect>();
        filters.add(new FilterEffect("原始", GPUImageFilterTools.FilterType.NORMAL, 0));

        filters.add(new FilterEffect("暧昧", GPUImageFilterTools.FilterType.ACV_AIMEI, 0));
        filters.add(new FilterEffect("淡蓝", GPUImageFilterTools.FilterType.ACV_DANLAN, 0));
        filters.add(new FilterEffect("蛋黄", GPUImageFilterTools.FilterType.ACV_DANHUANG, 0));
        filters.add(new FilterEffect("复古", GPUImageFilterTools.FilterType.ACV_FUGU, 0));
        filters.add(new FilterEffect("高冷", GPUImageFilterTools.FilterType.ACV_GAOLENG, 0));
        filters.add(new FilterEffect("怀旧", GPUImageFilterTools.FilterType.ACV_HUAIJIU, 0));
        filters.add(new FilterEffect("胶片", GPUImageFilterTools.FilterType.ACV_JIAOPIAN, 0));
        filters.add(new FilterEffect("可爱", GPUImageFilterTools.FilterType.ACV_KEAI, 0));
        filters.add(new FilterEffect("落寞", GPUImageFilterTools.FilterType.ACV_LOMO, 0));
        filters.add(new FilterEffect("加强", GPUImageFilterTools.FilterType.ACV_MORENJIAQIANG, 0));
        filters.add(new FilterEffect("暖心", GPUImageFilterTools.FilterType.ACV_NUANXIN, 0));
        filters.add(new FilterEffect("清新", GPUImageFilterTools.FilterType.ACV_QINGXIN, 0));
        filters.add(new FilterEffect("日系", GPUImageFilterTools.FilterType.ACV_RIXI, 0));
        filters.add(new FilterEffect("温暖", GPUImageFilterTools.FilterType.ACV_WENNUAN, 0));
        filters.add(new FilterEffect("CONTRAST", GPUImageFilterTools.FilterType.CONTRAST, 0));
        filters.add(new FilterEffect("GRAYSCALE", GPUImageFilterTools.FilterType.GRAYSCALE, 0));
        filters.add(new FilterEffect("SHARPEN", GPUImageFilterTools.FilterType.SHARPEN, 0));
        filters.add(new FilterEffect("SEPIA", GPUImageFilterTools.FilterType.SEPIA, 0));
        filters.add(new FilterEffect("SOBEL_EDGE_DETECTION", GPUImageFilterTools.FilterType.SOBEL_EDGE_DETECTION, 0));
        filters.add(new FilterEffect("THREE_X_THREE_CONVOLUTION", GPUImageFilterTools.FilterType.THREE_X_THREE_CONVOLUTION, 0));
        filters.add(new FilterEffect("FILTER_GROUP", GPUImageFilterTools.FilterType.FILTER_GROUP, 0));
        filters.add(new FilterEffect("EMBOSS", GPUImageFilterTools.FilterType.EMBOSS, 0));
        filters.add(new FilterEffect("POSTERIZE", GPUImageFilterTools.FilterType.POSTERIZE, 0));
        filters.add(new FilterEffect("GAMMA", GPUImageFilterTools.FilterType.GAMMA, 0));
        filters.add(new FilterEffect("INVERT", GPUImageFilterTools.FilterType.INVERT, 0));
        filters.add(new FilterEffect("HUE", GPUImageFilterTools.FilterType.HUE, 0));
        filters.add(new FilterEffect("PIXELATION", GPUImageFilterTools.FilterType.PIXELATION, 0));
        filters.add(new FilterEffect("SATURATION", GPUImageFilterTools.FilterType.SATURATION, 0));
        filters.add(new FilterEffect("EXPOSURE", GPUImageFilterTools.FilterType.EXPOSURE, 0));
        filters.add(new FilterEffect("HIGHLIGHT_SHADOW", GPUImageFilterTools.FilterType.HIGHLIGHT_SHADOW, 0));
        filters.add(new FilterEffect("MONOCHROME", GPUImageFilterTools.FilterType.MONOCHROME, 0));
        filters.add(new FilterEffect("OPACITY", GPUImageFilterTools.FilterType.OPACITY, 0));
        filters.add(new FilterEffect("RGB", GPUImageFilterTools.FilterType.RGB, 0));
        filters.add(new FilterEffect("VIGNETTE", GPUImageFilterTools.FilterType.VIGNETTE, 0));
        filters.add(new FilterEffect("TONE_CURVE", GPUImageFilterTools.FilterType.TONE_CURVE, 0));
        filters.add(new FilterEffect("BLEND_COLOR_BURN", GPUImageFilterTools.FilterType.BLEND_COLOR_BURN, 0));
        filters.add(new FilterEffect("BLEND_COLOR_DODGE", GPUImageFilterTools.FilterType.BLEND_COLOR_DODGE, 0));
        filters.add(new FilterEffect("BLEND_DIFFERENCE", GPUImageFilterTools.FilterType.BLEND_DIFFERENCE, 0));
        filters.add(new FilterEffect("BLEND_DISSOLVE", GPUImageFilterTools.FilterType.BLEND_DISSOLVE, 0));
        filters.add(new FilterEffect("BLEND_EXCLUSION", GPUImageFilterTools.FilterType.BLEND_EXCLUSION, 0));
        filters.add(new FilterEffect("BLEND_SOURCE_OVER", GPUImageFilterTools.FilterType.BLEND_SOURCE_OVER, 0));
        filters.add(new FilterEffect("BLEND_HARD_LIGHT", GPUImageFilterTools.FilterType.BLEND_HARD_LIGHT, 0));
        filters.add(new FilterEffect("BLEND_LIGHTEN", GPUImageFilterTools.FilterType.BLEND_LIGHTEN, 0));
        filters.add(new FilterEffect("BLEND_ADD", GPUImageFilterTools.FilterType.BLEND_ADD, 0));
        filters.add(new FilterEffect("BLEND_DIVIDE", GPUImageFilterTools.FilterType.BLEND_DIVIDE, 0));
        filters.add(new FilterEffect("BLEND_MULTIPLY", GPUImageFilterTools.FilterType.BLEND_MULTIPLY, 0));
        filters.add(new FilterEffect("BLEND_OVERLAY", GPUImageFilterTools.FilterType.BLEND_OVERLAY, 0));
        filters.add(new FilterEffect("BLEND_SCREEN", GPUImageFilterTools.FilterType.BLEND_SCREEN, 0));
        filters.add(new FilterEffect("BLEND_ALPHA", GPUImageFilterTools.FilterType.BLEND_ALPHA, 0));
        filters.add(new FilterEffect("BLEND_COLOR", GPUImageFilterTools.FilterType.BLEND_COLOR, 0));
        filters.add(new FilterEffect("BLEND_HUE", GPUImageFilterTools.FilterType.BLEND_HUE, 0));
        filters.add(new FilterEffect("BLEND_SATURATION", GPUImageFilterTools.FilterType.BLEND_SATURATION, 0));
        filters.add(new FilterEffect("BLEND_LUMINOSITY", GPUImageFilterTools.FilterType.BLEND_LUMINOSITY, 0));
        filters.add(new FilterEffect("BLEND_LINEAR_BURN", GPUImageFilterTools.FilterType.BLEND_LINEAR_BURN, 0));
        filters.add(new FilterEffect("BLEND_SOFT_LIGHT", GPUImageFilterTools.FilterType.BLEND_SOFT_LIGHT, 0));
        filters.add(new FilterEffect("BLEND_SUBTRACT", GPUImageFilterTools.FilterType.BLEND_SUBTRACT, 0));
        filters.add(new FilterEffect("BLEND_CHROMA_KEY", GPUImageFilterTools.FilterType.BLEND_CHROMA_KEY, 0));
        filters.add(new FilterEffect("BLEND_NORMAL", GPUImageFilterTools.FilterType.BLEND_NORMAL, 0));
        filters.add(new FilterEffect("LOOKUP_AMATORKA", GPUImageFilterTools.FilterType.LOOKUP_AMATORKA, 0));
        filters.add(new FilterEffect("GAUSSIAN_BLUR", GPUImageFilterTools.FilterType.GAUSSIAN_BLUR, 0));
        filters.add(new FilterEffect("CROSSHATCH", GPUImageFilterTools.FilterType.CROSSHATCH, 0));
        filters.add(new FilterEffect("BOX_BLUR", GPUImageFilterTools.FilterType.BOX_BLUR, 0));
        filters.add(new FilterEffect("CGA_COLORSPACE", GPUImageFilterTools.FilterType.CGA_COLORSPACE, 0));
        filters.add(new FilterEffect("DILATION", GPUImageFilterTools.FilterType.DILATION, 0));
        filters.add(new FilterEffect("KUWAHARA", GPUImageFilterTools.FilterType.KUWAHARA, 0));
        filters.add(new FilterEffect("RGB_DILATION", GPUImageFilterTools.FilterType.RGB_DILATION, 0));
        filters.add(new FilterEffect("SKETCH", GPUImageFilterTools.FilterType.SKETCH, 0));
        filters.add(new FilterEffect("TOON", GPUImageFilterTools.FilterType.TOON, 0));
        filters.add(new FilterEffect("SMOOTH_TOON", GPUImageFilterTools.FilterType.SMOOTH_TOON, 0));
        filters.add(new FilterEffect("BULGE_DISTORTION", GPUImageFilterTools.FilterType.BULGE_DISTORTION, 0));
        filters.add(new FilterEffect("GLASS_SPHERE", GPUImageFilterTools.FilterType.GLASS_SPHERE, 0));
        filters.add(new FilterEffect("HAZE", GPUImageFilterTools.FilterType.HAZE, 0));
        filters.add(new FilterEffect("LAPLACIAN", GPUImageFilterTools.FilterType.LAPLACIAN, 0));
        filters.add(new FilterEffect("NON_MAXIMUM_SUPPRESSION", GPUImageFilterTools.FilterType.NON_MAXIMUM_SUPPRESSION, 0));
        filters.add(new FilterEffect("SPHERE_REFRACTION", GPUImageFilterTools.FilterType.SPHERE_REFRACTION, 0));
        filters.add(new FilterEffect("SWIRL", GPUImageFilterTools.FilterType.SWIRL, 0));
        filters.add(new FilterEffect("WEAK_PIXEL_INCLUSION", GPUImageFilterTools.FilterType.WEAK_PIXEL_INCLUSION, 0));
        filters.add(new FilterEffect("FALSE_COLOR", GPUImageFilterTools.FilterType.FALSE_COLOR, 0));
        filters.add(new FilterEffect("COLOR_BALANCE", GPUImageFilterTools.FilterType.COLOR_BALANCE, 0));

        return filters;
    }

}
