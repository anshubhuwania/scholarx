package org.sefglobal.scholarx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mentee")
public class Mentee extends EnrolledUser {

    @ManyToOne(optional = false)
    private Mentor mentor;

    @Column(nullable = false)
    private String submissionUrl;

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public String getSubmissionUrl() {
        return submissionUrl;
    }

    public void setSubmissionUrl(String submissionUrl) {
        this.submissionUrl = submissionUrl;
    }
}
