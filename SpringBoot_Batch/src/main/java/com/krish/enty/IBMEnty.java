package com.krish.enty;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "IBM_STOCK_DATA")
public class IBMEnty {

	@Id
	@Column(name = "REF_NUM")
	private Long refnum;
	@Column(name = "DATE")
	private LocalDate date;
	@Column(name = "OPEN")
	private Double open;
	@Column(name = "HIGH")
	private Double high;
	@Column(name = "LOW_CLOSE")
	private Double close;
	@Column(name = "OPEN_INT")
	private Double openint;
	@Column(name = "VOLUMN")
	private Double volume;
}
