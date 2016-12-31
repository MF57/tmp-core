package org.tmp.core.test.tournamentRequest;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by mf57 on 31.12.2016.
 */
public class TournamentRequest {
    private String id;
    private String organizerName;
    private String name;
    private String place;
    private String description;
  //  private Sport sport;
  //  private Strategy strategy;
  //  private TournamentState state;
    private List<String> referees;
 //   private Capacity capacity;
 //   private Enrollment enrollment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime backupStartTime;
    private LocalDateTime backupEndTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getReferees() {
        return referees;
    }

    public void setReferees(List<String> referees) {
        this.referees = referees;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getBackupStartTime() {
        return backupStartTime;
    }

    public void setBackupStartTime(LocalDateTime backupStartTime) {
        this.backupStartTime = backupStartTime;
    }

    public LocalDateTime getBackupEndTime() {
        return backupEndTime;
    }

    public void setBackupEndTime(LocalDateTime backupEndTime) {
        this.backupEndTime = backupEndTime;
    }


}
