package com.kh.chapter2.set.vo;

import java.util.Objects;

public class Music implements Comparable<Music> {
	
	private String tittle;
	
	private String artist;
	
	private int ranking;
	
	public Music() {
	}

	public Music(String tittle, String artist, int ranking) {
		super();
		this.tittle = tittle;
		this.artist = artist;
		this.ranking = ranking;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Music [tittle = " + tittle + ", artist = " + artist + ", ranking = " + ranking + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(artist, ranking, tittle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(artist, other.artist) && ranking == other.ranking && Objects.equals(tittle, other.tittle);
	}

	@Override
	public int compareTo(Music o) {
		
		if (this.ranking == o.ranking) {
			return this.artist.compareTo(o.artist);
			
		} else {
			return (this.ranking > o.ranking) ? 1 : -1;
		}
	}
}
