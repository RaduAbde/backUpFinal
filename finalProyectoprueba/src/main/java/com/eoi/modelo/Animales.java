package com.eoi.modelo;
public class Animales {
    private String AnimalNombre;
    private String AnimalTipo;
    private String AnimalEdad;
    private int AnimalId;
    private String AnimalRaza;
    private String AnimalSexo;
    private int AnimalAlta;
    private String AnimalPath;

    public Animales() {
        super();

    }
    public Animales(String animalNombre, String animalTipo, String animalEdad, int animalId, String animalRaza,
            String animalSexo, int animalAlta, String animalPath) {
        super();
        AnimalNombre = animalNombre;
        AnimalTipo = animalTipo;
        AnimalEdad = animalEdad;
        AnimalId = animalId;
        AnimalRaza = animalRaza;
        AnimalSexo = animalSexo;
        AnimalAlta = animalAlta;
        AnimalPath = animalPath;
    }
    public String getAnimalNombre() {
        return AnimalNombre;
    }
    public void setAnimalNombre(String animalNombre) {
        AnimalNombre = animalNombre;
    }
    public String getAnimalTipo() {
        return AnimalTipo;
    }
    public void setAnimalTipo(String animalTipo) {
        AnimalTipo = animalTipo;
    }
    public String getAnimalEdad() {
        return AnimalEdad;
    }
    public void setAnimalEdad(String animalEdad) {
        AnimalEdad = animalEdad;
    }
    public int getAnimalId() {
        return AnimalId;
    }
    public void setAnimalId(int animalId) {
        AnimalId = animalId;
    }
    public String getAnimalRaza() {
        return AnimalRaza;
    }
    public void setAnimalRaza(String animalRaza) {
        AnimalRaza = animalRaza;
    }
    public String getAnimalSexo() {
        return AnimalSexo;
    }
    public void setAnimalSexo(String animalSexo) {
        AnimalSexo = animalSexo;
    }
    @Override
    public String toString() {
        return "Animales [AnimalNombre=" + AnimalNombre + ", AnimalTipo=" + AnimalTipo + ", AnimalEdad=" + AnimalEdad
                + ", AnimalId=" + AnimalId + ", AnimalRaza=" + AnimalRaza + ", AnimalSexo=" + AnimalSexo + "]";
    }
}
