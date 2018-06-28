package com.example.rumblr.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Rumble {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false, updatable = false)
    private final Long id;

    private final String message;

    private final Date time;

    private Double latitude;

    private Double longitude;




    public Rumble(String message, Date time) {
        this(message, time, null, null);
    }

    public Rumble(
            String message, Date time, Double longitude, Double latitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }



    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    @Override
    public boolean equals(Object that) {
        //return EqualsBuilder.reflectionEquals(this, that, "id", "time");
        return true;
    }

    @Override
    public int hashCode() {
      //  return HashCodeBuilder.reflectionHashCode(this, "id", "time");
        return 1;
    }


}
