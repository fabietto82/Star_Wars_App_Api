package com.example.fyahbetz.star_wars_app_api.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "rotation_period",
        "orbital_period",
        "diameter",
        "climate",
        "gravity",
        "terrain",
        "surface_water",
        "population",
        "residents",
        "films",
        "created",
        "edited",
        "url"
})
public class Planet  implements Parcelable{

    @JsonProperty("name")
    private String name;
    @JsonProperty("rotation_period")
    private String rotationPeriod;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    @JsonProperty("diameter")
    private String diameter;
    @JsonProperty("climate")
    private String climate;
    @JsonProperty("gravity")
    private String gravity;
    @JsonProperty("terrain")
    private String terrain;
    @JsonProperty("surface_water")
    private String surfaceWater;
    @JsonProperty("population")
    private String population;
    @JsonProperty("residents")
    private List<String> residents = null;
    @JsonProperty("films")
    private List<String> films = null;
    @JsonProperty("created")
    private String created;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Planet() {
    }

    /**
     *
     * @param edited
     * @param terrain
     * @param diameter
     * @param orbitalPeriod
     * @param films
     * @param url
     * @param created
     * @param rotationPeriod
     * @param name
     * @param surfaceWater
     * @param climate
     * @param gravity
     * @param population
     * @param residents
     */
    public Planet(String name, String rotationPeriod, String orbitalPeriod, String diameter, String climate, String gravity, String terrain, String surfaceWater, String population, List<String> residents, List<String> films, String created, String edited, String url) {
        super();
        this.name = name;
        this.rotationPeriod = rotationPeriod;
        this.orbitalPeriod = orbitalPeriod;
        this.diameter = diameter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.surfaceWater = surfaceWater;
        this.population = population;
        this.residents = residents;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    protected Planet(Parcel in) {
        name = in.readString();
        rotationPeriod = in.readString();
        orbitalPeriod = in.readString();
        diameter = in.readString();
        climate = in.readString();
        gravity = in.readString();
        terrain = in.readString();
        surfaceWater = in.readString();
        population = in.readString();
        residents = in.createStringArrayList();
        films = in.createStringArrayList();
        created = in.readString();
        edited = in.readString();
        url = in.readString();
    }

    public static final Creator<Planet> CREATOR = new Creator<Planet>() {
        @Override
        public Planet createFromParcel(Parcel in) {
            return new Planet(in);
        }

        @Override
        public Planet[] newArray(int size) {
            return new Planet[size];
        }
    };

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Planet withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("rotation_period")
    public String getRotationPeriod() {
        return rotationPeriod;
    }

    @JsonProperty("rotation_period")
    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public Planet withRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
        return this;
    }

    @JsonProperty("orbital_period")
    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @JsonProperty("orbital_period")
    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Planet withOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
        return this;
    }

    @JsonProperty("diameter")
    public String getDiameter() {
        return diameter;
    }

    @JsonProperty("diameter")
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public Planet withDiameter(String diameter) {
        this.diameter = diameter;
        return this;
    }

    @JsonProperty("climate")
    public String getClimate() {
        return climate;
    }

    @JsonProperty("climate")
    public void setClimate(String climate) {
        this.climate = climate;
    }

    public Planet withClimate(String climate) {
        this.climate = climate;
        return this;
    }

    @JsonProperty("gravity")
    public String getGravity() {
        return gravity;
    }

    @JsonProperty("gravity")
    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public Planet withGravity(String gravity) {
        this.gravity = gravity;
        return this;
    }

    @JsonProperty("terrain")
    public String getTerrain() {
        return terrain;
    }

    @JsonProperty("terrain")
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Planet withTerrain(String terrain) {
        this.terrain = terrain;
        return this;
    }

    @JsonProperty("surface_water")
    public String getSurfaceWater() {
        return surfaceWater;
    }

    @JsonProperty("surface_water")
    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public Planet withSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
        return this;
    }

    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(String population) {
        this.population = population;
    }

    public Planet withPopulation(String population) {
        this.population = population;
        return this;
    }

    @JsonProperty("residents")
    public List<String> getResidents() {
        return residents;
    }

    @JsonProperty("residents")
    public void setResidents(List<String> residents) {
        this.residents = residents;
    }

    public Planet withResidents(List<String> residents) {
        this.residents = residents;
        return this;
    }

    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }

    public Planet withFilms(List<String> films) {
        this.films = films;
        return this;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    public Planet withCreated(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(String edited) {
        this.edited = edited;
    }

    public Planet withEdited(String edited) {
        this.edited = edited;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Planet withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Planet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(rotationPeriod);
        parcel.writeString(orbitalPeriod);
        parcel.writeString(diameter);
        parcel.writeString(climate);
        parcel.writeString(gravity);
        parcel.writeString(terrain);
        parcel.writeString(surfaceWater);
        parcel.writeString(population);
        parcel.writeStringList(residents);
        parcel.writeStringList(films);
        parcel.writeString(created);
        parcel.writeString(edited);
        parcel.writeString(url);
    }
}


