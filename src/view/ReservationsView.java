package view;

public class ReservationsView {
  // 3 buttons for this view
		JButton Reservation_1  = new JButton("Reservation 1");
		add(Reservation_1);
		JButton Reservation_2 = new JButton ("Reservation 2");
		add(Reservation_2);
		JButton goBack = new JButton("Go Back");
		add(goBack);
		//basic set up
		setVisible(true);
    setSize(500, 500);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
