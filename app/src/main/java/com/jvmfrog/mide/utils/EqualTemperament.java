package com.jvmfrog.mide.utils;

public class EqualTemperament {
    /**
     * Reference frequency (A4) in Hz
     */
    public static final double A4_440Hz = 440;

    /**
     * Interval from A4 to C0 in semitones
     */
    public static final int INTERVAL_TO_C0 = -57;

    /**
     * Interval from A4 to B8 in semitones
     */
    public static final int INTERVAL_TO_B8 = 50;
    /**
     * f(i) = ref * 2^(i/12)
     * */
    public static double calculate(int semitone, double reference) {
        return reference * Math.pow(2, semitone / 12d);
    }
}
