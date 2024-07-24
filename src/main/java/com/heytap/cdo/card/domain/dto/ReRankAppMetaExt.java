package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;
import java.util.List;
import java.util.Map;

public class ReRankAppMetaExt {
    @Tag(3)
    private float ea;
    @Tag(6)
    private List<Float> eas;
    @Tag(4)
    private float ed;
    @Tag(7)
    private List<Float> eds;
    @Tag(5)
    private float es;
    @Tag(8)
    private List<Float> ess;
    @Tag(9)
    private Map<String, Float> fs;
    @Tag(10)
    private boolean re;
    @Tag(1)
    private float score;
    @Tag(2)
    private List<Float> scores;

    public float getEa() {
        return this.ea;
    }

    public List<Float> getEas() {
        return this.eas;
    }

    public float getEd() {
        return this.ed;
    }

    public List<Float> getEds() {
        return this.eds;
    }

    public float getEs() {
        return this.es;
    }

    public List<Float> getEss() {
        return this.ess;
    }

    public Map<String, Float> getFs() {
        return this.fs;
    }

    public float getScore() {
        return this.score;
    }

    public List<Float> getScores() {
        return this.scores;
    }

    public boolean isRe() {
        return this.re;
    }

    public void setEa(float ea) {
        this.ea = ea;
    }

    public void setEas(List<Float> eas) {
        this.eas = eas;
    }

    public void setEd(float ed) {
        this.ed = ed;
    }

    public void setEds(List<Float> eds) {
        this.eds = eds;
    }

    public void setEs(float es) {
        this.es = es;
    }

    public void setEss(List<Float> ess) {
        this.ess = ess;
    }

    public void setFs(Map<String, Float> fs) {
        this.fs = fs;
    }

    public void setRe(boolean re) {
        this.re = re;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setScores(List<Float> scores) {
        this.scores = scores;
    }

    public String toString() {
        return "ReRankAppMetaExt{score=" + this.score + ", scores=" + this.scores + ", ea=" + this.ea + ", ed=" + this.ed + ", es=" + this.es + ", eas=" + this.eas + ", eds=" + this.eds + ", ess=" + this.ess + ", fs=" + this.fs + ", re=" + this.re + '}';
    }
}