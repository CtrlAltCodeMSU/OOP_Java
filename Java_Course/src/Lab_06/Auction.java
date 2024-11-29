package Lab_06;
import java.util.ArrayList;
public class Auction {
		private ArrayList<Lot> lots;

		public Auction() {
			this.lots = new ArrayList<>();
		}

		public void addLot(Lot lot) {
			lots.add(lot);
		}

		public void close() {
			for (Lot lot : lots) {
				Double highestBid = lot.getHighestBid();
				if (highestBid != null) {
					System.out.println("Lot " + lot.getNumber() + ": Sold to " + lot.getHighestBidder() + " for " + highestBid);
				} else {
					System.out.println("Lot " + lot.getNumber() + ": No bids");
				}
			}
		}

		public ArrayList<Lot> getUnsold() {
			ArrayList<Lot> unsoldLots = new ArrayList<>();
			for (Lot lot : lots) {
				if (lot.getHighestBid() == null) {
					unsoldLots.add(lot);
				}
			}
			return unsoldLots;
		}

		public Lot removeLot(int number) {
			for (Lot lot : lots) {
				if (lot.getNumber() == number) {
					lots.remove(lot);
					return lot;
				}
			}
			return null;
		}
	}




	class Lot {
		private int number;
		private String description;
		private Double highestBid;
		private String highestBidder;

		public Lot(int number, String description) {
			this.number = number;
			this.description = description;
			this.highestBid = null;
			this.highestBidder = null;
		}

		public int getNumber() {
			return number;
		}

		public String getDescription() {
			return description;
		}

		public Double getHighestBid() {
			return highestBid;
		}

		public String getHighestBidder() {
			return highestBidder;
		}

		public void placeBid(String bidder, double amount) {
			if (highestBid == null || amount > highestBid) {
				highestBid = amount;
				highestBidder = bidder;
			}
		}
	}


	class Auction_System {
		public static void main(String[] args) {
			Auction auction = new Auction();

			Lot lot1 = new Lot(1, "Item 1");
			Lot lot2 = new Lot(2, "Item 2");
			Lot lot3 = new Lot(3, "Item 3");

			auction.addLot(lot1);
			auction.addLot(lot2);
			auction.addLot(lot3);

			lot1.placeBid("John Doe", 100.0);
			lot1.placeBid("Jane Doe", 120.0);
			lot2.placeBid("Bob Smith", 50.0);

			auction.close();

			ArrayList<Lot> unsoldLots = auction.getUnsold();
			System.out.println("Unsold Lots:");
			for (Lot lot : unsoldLots) {
				System.out.println("Lot " + lot.getNumber() + ": " + lot.getDescription());
			}

			Lot removedLot = auction.removeLot(2);
			if (removedLot != null) {
				System.out.println("Removed Lot: " + removedLot.getNumber());
			} else {
				System.out.println("Lot not found");
			}
		}
	}

