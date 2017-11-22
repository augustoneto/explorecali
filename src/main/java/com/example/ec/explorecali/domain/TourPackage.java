package com.example.ec.explorecali.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TourPackage implements Serializable {
	
	private static final long serialVersionUID = -3547822967889533248L;

	@Id
	private String code;
	
	@Column
	private String name;

	public TourPackage(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	protected TourPackage() {
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
	
	@Override
    public String toString() {
        return "TourPackage{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourPackage that = (TourPackage) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

}
