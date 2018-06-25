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
        "model",
        "manufacturer",
        "cost_in_credits",
        "length",
        "max_atmosphering_speed",
        "crew",
        "passengers",
        "cargo_capacity",
        "consumables",
        "hyperdrive_rating",
        "MGLT",
        "starship_class",
        "pilots",
        "films",
        "created",
        "edited",
        "url"
})
public class Starship implements Parcelable {

    @JsonProperty("name")
    private String name;
    @JsonProperty("model")
    private String model;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("cost_in_credits")
    private String costInCredits;
    @JsonProperty("length")
    private String length;
    @JsonProperty("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    @JsonProperty("crew")
    private String crew;
    @JsonProperty("passengers")
    private String passengers;
    @JsonProperty("cargo_capacity")
    private String cargoCapacity;
    @JsonProperty("consumables")
    private String consumables;
    @JsonProperty("hyperdrive_rating")
    private String hyperdriveRating;
    @JsonProperty("MGLT")
    private String mGLT;
    @JsonProperty("starship_class")
    private String starshipClass;
    @JsonProperty("pilots")
    private List<String> pilots = null;
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
    public Starship() {
    }

    /**
     *
     * @param edited
     * @param model
     * @param cargoCapacity
     * @param crew
     * @param films
     * @param url
     * @param starshipClass
     * @param passengers
     * @param pilots
     * @param created
     * @param consumables
     * @param hyperdriveRating
     * @param manufacturer
     * @param costInCredits
     * @param mGLT
     * @param name
     * @param length
     * @param maxAtmospheringSpeed
     */
    public Starship(String name, String model, String manufacturer, String costInCredits, String length, String maxAtmospheringSpeed, String crew, String passengers, String cargoCapacity, String consumables, String hyperdriveRating, String mGLT, String starshipClass, List<String> pilots, List<String> films, String created, String edited, String url) {
        super();
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.costInCredits = costInCredits;
        this.length = length;
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        this.crew = crew;
        this.passengers = passengers;
        this.cargoCapacity = cargoCapacity;
        this.consumables = consumables;
        this.hyperdriveRating = hyperdriveRating;
        this.mGLT = mGLT;
        this.starshipClass = starshipClass;
        this.pilots = pilots;
        this.films = films;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    protected Starship(Parcel in) {
        name = in.readString();
        model = in.readString();
        manufacturer = in.readString();
        costInCredits = in.readString();
        length = in.readString();
        maxAtmospheringSpeed = in.readString();
        crew = in.readString();
        passengers = in.readString();
        cargoCapacity = in.readString();
        consumables = in.readString();
        hyperdriveRating = in.readString();
        mGLT = in.readString();
        starshipClass = in.readString();
        pilots = in.createStringArrayList();
        films = in.createStringArrayList();
        created = in.readString();
        edited = in.readString();
        url = in.readString();
    }

    public static final Creator<Starship> CREATOR = new Creator<Starship>() {
        @Override
        public Starship createFromParcel(Parcel in) {
            return new Starship(in);
        }

        @Override
        public Starship[] newArray(int size) {
            return new Starship[size];
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

    public Starship withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    public Starship withModel(String model) {
        this.model = model;
        return this;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Starship withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @JsonProperty("cost_in_credits")
    public String getCostInCredits() {
        return costInCredits;
    }

    @JsonProperty("cost_in_credits")
    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }

    public Starship withCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
        return this;
    }

    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    public Starship withLength(String length) {
        this.length = length;
        return this;
    }

    @JsonProperty("max_atmosphering_speed")
    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    @JsonProperty("max_atmosphering_speed")
    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    public Starship withMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        return this;
    }

    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }

    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

    public Starship withCrew(String crew) {
        this.crew = crew;
        return this;
    }

    @JsonProperty("passengers")
    public String getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public Starship withPassengers(String passengers) {
        this.passengers = passengers;
        return this;
    }

    @JsonProperty("cargo_capacity")
    public String getCargoCapacity() {
        return cargoCapacity;
    }

    @JsonProperty("cargo_capacity")
    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Starship withCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    @JsonProperty("consumables")
    public String getConsumables() {
        return consumables;
    }

    @JsonProperty("consumables")
    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public Starship withConsumables(String consumables) {
        this.consumables = consumables;
        return this;
    }

    @JsonProperty("hyperdrive_rating")
    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    @JsonProperty("hyperdrive_rating")
    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }

    public Starship withHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
        return this;
    }

    @JsonProperty("MGLT")
    public String getMGLT() {
        return mGLT;
    }

    @JsonProperty("MGLT")
    public void setMGLT(String mGLT) {
        this.mGLT = mGLT;
    }

    public Starship withMGLT(String mGLT) {
        this.mGLT = mGLT;
        return this;
    }

    @JsonProperty("starship_class")
    public String getStarshipClass() {
        return starshipClass;
    }

    @JsonProperty("starship_class")
    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }

    public Starship withStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
        return this;
    }

    @JsonProperty("pilots")
    public List<String> getPilots() {
        return pilots;
    }

    @JsonProperty("pilots")
    public void setPilots(List<String> pilots) {
        this.pilots = pilots;
    }

    public Starship withPilots(List<String> pilots) {
        this.pilots = pilots;
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

    public Starship withFilms(List<String> films) {
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

    public Starship withCreated(String created) {
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

    public Starship withEdited(String edited) {
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

    public Starship withUrl(String url) {
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

    public Starship withAdditionalProperty(String name, Object value) {
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
        parcel.writeString(model);
        parcel.writeString(manufacturer);
        parcel.writeString(costInCredits);
        parcel.writeString(length);
        parcel.writeString(maxAtmospheringSpeed);
        parcel.writeString(crew);
        parcel.writeString(passengers);
        parcel.writeString(cargoCapacity);
        parcel.writeString(consumables);
        parcel.writeString(hyperdriveRating);
        parcel.writeString(mGLT);
        parcel.writeString(starshipClass);
        parcel.writeStringList(pilots);
        parcel.writeStringList(films);
        parcel.writeString(created);
        parcel.writeString(edited);
        parcel.writeString(url);
    }
}