package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Reservation() {
		super();
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = checkin;
		this.checkout = checkout;
	}
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkin)
			+ ", check-out: "
			+ sdf.format(checkout)
			+ ", "
			+ duration()
			+ " nights";
	}

}
