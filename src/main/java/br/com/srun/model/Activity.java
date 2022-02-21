package br.com.srun.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.srun.model.enumeration.TypeActivity;

@Entity
@Table(name = "tb_activity")
public class Activity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_activity")
    private Long id;

    @NotNull
    @Column(name = "id_user")
    private Long idUser;

    @Enumerated(EnumType.STRING)
    private TypeActivity type_activity;

    @NotNull
    @Column(name = "date_start")
    private LocalDateTime dateStart;

    @Column(name = "date_end")
    private LocalDateTime dateEnd;

    @Column(name = "lat_start")
    private BigDecimal latStart;

    @Column(name = "lat_end")
    private BigDecimal latEnd;

    @Column(name = "lng_start")
    private BigDecimal lngStart;

    @Column(name = "lng_end")
    private BigDecimal lngEnd;

    @Column
    private LocalDateTime scheduled;

    @Column
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public TypeActivity getType_activity() {
        return type_activity;
    }

    public void setType_activity(TypeActivity type_activity) {
        this.type_activity = type_activity;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public BigDecimal getLatStart() {
        return latStart;
    }

    public void setLatStart(BigDecimal latStart) {
        this.latStart = latStart;
    }

    public BigDecimal getLatEnd() {
        return latEnd;
    }

    public void setLatEnd(BigDecimal latEnd) {
        this.latEnd = latEnd;
    }

    public BigDecimal getLngStart() {
        return lngStart;
    }

    public void setLngStart(BigDecimal lngStart) {
        this.lngStart = lngStart;
    }
    
    public BigDecimal getLngEnd() {
		return lngEnd;
	}
    public void setLngEnd(BigDecimal lngEnd) {
		this.lngEnd = lngEnd;
	}
    
	public LocalDateTime getScheduled() {
		return scheduled;
	}
	public void setScheduled(LocalDateTime scheduled) {
		this.scheduled = scheduled;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
}
