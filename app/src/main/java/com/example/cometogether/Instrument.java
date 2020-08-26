package com.example.cometogether;

public class Instrument {
    private int level;
    private String instrument_name;
    private String genre;

    public Instrument() {
    }

    public Instrument(int level, String instrument_name, String genre) {
        this.level = level;
        this.instrument_name = instrument_name;
        this.genre = genre;
    }

    public Instrument(String ins_details){

    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setInstrument(String instrument) {
        this.instrument_name = instrument;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "instrument string";
    }
}
