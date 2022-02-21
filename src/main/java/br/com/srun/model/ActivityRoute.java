package br.com.srun.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_route_activity")
public class ActivityRoute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_route_activity")
	private Long id;
	
	@NotNull
    @Column(name = "id_activity")
    private Long idActivity;
	
	@NotNull
	@Column(name = "latitude")
    private BigDecimal latitude;

	@NotNull
    @Column(name = "longitude")
    private BigDecimal longitude;

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(Long idActivity) {
		this.idActivity = idActivity;
	}

	public BigDecimal getLat() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLng(BigDecimal longitude) {
		this.longitude = longitude;
	}
}
