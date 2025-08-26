package javaFastFoods;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import SoundPackage.NotificationSounds;

/**
 *
 * @author elisha
 */
public class mainFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(mainFrame.class.getName());


    public mainFrame() {
        initComponents();
    }
    
//    Function to round off double value to two decimal places
    public Double RoundedValue(Double value){
        DecimalFormat df = new DecimalFormat("#.##"); // Define pattern for two decimal places
        String formattedValue = df.format(value);
        
        value = Double.valueOf(formattedValue);
        
        return value;
    }
    
    public void AddToCart(String Name, Double Price){
//        Notification Sound
        NotificationSounds.playComplete();
        String prompt = "Please Enter the "+ Name + " Quantity";
        
        try {
            String quantity = JOptionPane.showInputDialog(null, prompt, "1");
            
            int tQuantity = Integer.parseInt(quantity);
            Double totalAmount = Price * tQuantity;
            Double RoundedTotalAmount = RoundedValue(totalAmount);

            // add product to cart
            DefaultTableModel dt  = (DefaultTableModel) cart_table.getModel();
                Vector v = new Vector();

                v.add(Name);
                v.add(tQuantity);
                v.add(RoundedTotalAmount);
                dt.addRow(v);          
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
       
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Cheeseburger = new javax.swing.JPanel();
        cheeseburger_image = new javax.swing.JLabel();
        cheeseburger_label = new javax.swing.JLabel();
        doubleBeefBurger = new javax.swing.JPanel();
        doubleBeefBurger_image = new javax.swing.JLabel();
        doubleCheeseburger_label = new javax.swing.JLabel();
        friedChicken = new javax.swing.JPanel();
        friedChicken_image = new javax.swing.JLabel();
        friedchicken_label = new javax.swing.JLabel();
        chickenBurrito = new javax.swing.JPanel();
        chickenBurrito_image = new javax.swing.JLabel();
        chickenburrito_label = new javax.swing.JLabel();
        shawarma = new javax.swing.JPanel();
        shawarma_image = new javax.swing.JLabel();
        shawarma_label = new javax.swing.JLabel();
        rolex = new javax.swing.JPanel();
        rolex_label = new javax.swing.JLabel();
        shawarma_label1 = new javax.swing.JLabel();
        frenchFries = new javax.swing.JPanel();
        frenchFries_image = new javax.swing.JLabel();
        frenchFries_label = new javax.swing.JLabel();
        coke = new javax.swing.JPanel();
        coke_image = new javax.swing.JLabel();
        coke_label = new javax.swing.JLabel();
        pepsi = new javax.swing.JPanel();
        pepsi_image = new javax.swing.JLabel();
        pepsi_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart_table = new javax.swing.JTable();
        recieptView_panel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        subtotal_labrl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tax_label = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        discount_btn = new javax.swing.JTextField();
        pay_btn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        printReciept_btn = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 36)); // NOI18N
        jLabel1.setText("Java Fast Foodz");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu Sans", 1, 24))); // NOI18N

        Cheeseburger.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cheeseburger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheeseburgerMouseClicked(evt);
            }
        });

        cheeseburger_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cheeseburger.jpg"))); // NOI18N

        cheeseburger_label.setFont(new java.awt.Font("URW Bookman", 1, 24)); // NOI18N
        cheeseburger_label.setForeground(new java.awt.Color(255, 102, 0));
        cheeseburger_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cheeseburger_label.setText("Cheeseburger");
        cheeseburger_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cheeseburger_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout CheeseburgerLayout = new javax.swing.GroupLayout(Cheeseburger);
        Cheeseburger.setLayout(CheeseburgerLayout);
        CheeseburgerLayout.setHorizontalGroup(
            CheeseburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheeseburgerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CheeseburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CheeseburgerLayout.createSequentialGroup()
                        .addComponent(cheeseburger_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(cheeseburger_image, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        CheeseburgerLayout.setVerticalGroup(
            CheeseburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheeseburgerLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(cheeseburger_image, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheeseburger_label)
                .addGap(2, 2, 2))
        );

        doubleBeefBurger.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doubleBeefBurger.setPreferredSize(new java.awt.Dimension(263, 237));
        doubleBeefBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doubleBeefBurgerMouseClicked(evt);
            }
        });

        doubleBeefBurger_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doubleCheeseBurger.jpg"))); // NOI18N

        doubleCheeseburger_label.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        doubleCheeseburger_label.setForeground(new java.awt.Color(255, 102, 0));
        doubleCheeseburger_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doubleCheeseburger_label.setText("Double Cheeseburger");
        doubleCheeseburger_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        doubleCheeseburger_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout doubleBeefBurgerLayout = new javax.swing.GroupLayout(doubleBeefBurger);
        doubleBeefBurger.setLayout(doubleBeefBurgerLayout);
        doubleBeefBurgerLayout.setHorizontalGroup(
            doubleBeefBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doubleBeefBurger_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(doubleBeefBurgerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doubleCheeseburger_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        doubleBeefBurgerLayout.setVerticalGroup(
            doubleBeefBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doubleBeefBurgerLayout.createSequentialGroup()
                .addComponent(doubleBeefBurger_image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doubleCheeseburger_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        friedChicken.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        friedChicken.setPreferredSize(new java.awt.Dimension(263, 237));
        friedChicken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friedChickenMouseClicked(evt);
            }
        });

        friedChicken_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/friedchicken.jpg"))); // NOI18N

        friedchicken_label.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        friedchicken_label.setForeground(new java.awt.Color(255, 102, 0));
        friedchicken_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        friedchicken_label.setText("Fried Chicken (2pcs)");
        friedchicken_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        friedchicken_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout friedChickenLayout = new javax.swing.GroupLayout(friedChicken);
        friedChicken.setLayout(friedChickenLayout);
        friedChickenLayout.setHorizontalGroup(
            friedChickenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(friedChicken_image, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(friedChickenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friedchicken_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        friedChickenLayout.setVerticalGroup(
            friedChickenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friedChickenLayout.createSequentialGroup()
                .addComponent(friedChicken_image, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(friedchicken_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        chickenBurrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chickenBurrito.setPreferredSize(new java.awt.Dimension(263, 237));
        chickenBurrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chickenBurritoMouseClicked(evt);
            }
        });
        chickenBurrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chickenBurritoKeyPressed(evt);
            }
        });

        chickenBurrito_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chickenBurrito.jpeg"))); // NOI18N

        chickenburrito_label.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        chickenburrito_label.setForeground(new java.awt.Color(255, 102, 0));
        chickenburrito_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chickenburrito_label.setText("Chicken Burrito");
        chickenburrito_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        chickenburrito_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout chickenBurritoLayout = new javax.swing.GroupLayout(chickenBurrito);
        chickenBurrito.setLayout(chickenBurritoLayout);
        chickenBurritoLayout.setHorizontalGroup(
            chickenBurritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chickenBurritoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chickenBurritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chickenburrito_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(chickenBurritoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(chickenBurrito_image)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        chickenBurritoLayout.setVerticalGroup(
            chickenBurritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chickenBurritoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chickenBurrito_image, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chickenburrito_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        shawarma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shawarma.setPreferredSize(new java.awt.Dimension(263, 237));
        shawarma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shawarmaMouseClicked(evt);
            }
        });

        shawarma_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shawarma.jpeg"))); // NOI18N

        shawarma_label.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        shawarma_label.setForeground(new java.awt.Color(255, 102, 0));
        shawarma_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shawarma_label.setText("Shawarma");
        shawarma_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        shawarma_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout shawarmaLayout = new javax.swing.GroupLayout(shawarma);
        shawarma.setLayout(shawarmaLayout);
        shawarmaLayout.setHorizontalGroup(
            shawarmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shawarmaLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(shawarma_image)
                .addGap(15, 15, 15))
            .addComponent(shawarma_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        shawarmaLayout.setVerticalGroup(
            shawarmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shawarmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shawarma_image, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shawarma_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rolex.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rolex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rolexMouseClicked(evt);
            }
        });

        rolex_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rolex.jpg"))); // NOI18N

        shawarma_label1.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        shawarma_label1.setForeground(new java.awt.Color(255, 102, 0));
        shawarma_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shawarma_label1.setText("Rolex");
        shawarma_label1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        shawarma_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout rolexLayout = new javax.swing.GroupLayout(rolex);
        rolex.setLayout(rolexLayout);
        rolexLayout.setHorizontalGroup(
            rolexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rolexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rolexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rolex_label)
                    .addComponent(shawarma_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rolexLayout.setVerticalGroup(
            rolexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rolexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rolex_label, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shawarma_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frenchFries.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        frenchFries.setPreferredSize(new java.awt.Dimension(263, 237));
        frenchFries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frenchFriesMouseClicked(evt);
            }
        });
        frenchFries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                frenchFriesKeyPressed(evt);
            }
        });

        frenchFries_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fries.jpg"))); // NOI18N

        frenchFries_label.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        frenchFries_label.setForeground(new java.awt.Color(255, 102, 0));
        frenchFries_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frenchFries_label.setText("Fries (chips)");
        frenchFries_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        frenchFries_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout frenchFriesLayout = new javax.swing.GroupLayout(frenchFries);
        frenchFries.setLayout(frenchFriesLayout);
        frenchFriesLayout.setHorizontalGroup(
            frenchFriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frenchFriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frenchFries_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(frenchFriesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(frenchFries_image, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        frenchFriesLayout.setVerticalGroup(
            frenchFriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frenchFriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frenchFries_image, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(frenchFries_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        coke.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coke.setPreferredSize(new java.awt.Dimension(263, 237));
        coke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cokeMouseClicked(evt);
            }
        });
        coke.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cokeKeyPressed(evt);
            }
        });

        coke_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coke.jpeg"))); // NOI18N

        coke_label.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        coke_label.setForeground(new java.awt.Color(255, 102, 0));
        coke_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coke_label.setText("CocaCola");
        coke_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        coke_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout cokeLayout = new javax.swing.GroupLayout(coke);
        coke.setLayout(cokeLayout);
        cokeLayout.setHorizontalGroup(
            cokeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cokeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coke_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cokeLayout.createSequentialGroup()
                        .addComponent(coke_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        cokeLayout.setVerticalGroup(
            cokeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coke_image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(coke_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pepsi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pepsi.setPreferredSize(new java.awt.Dimension(263, 237));
        pepsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pepsiMouseClicked(evt);
            }
        });
        pepsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pepsiKeyPressed(evt);
            }
        });

        pepsi_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pepsi.jpg"))); // NOI18N

        pepsi_label.setFont(new java.awt.Font("URW Bookman", 1, 20)); // NOI18N
        pepsi_label.setForeground(new java.awt.Color(255, 102, 0));
        pepsi_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pepsi_label.setText("Pepsi");
        pepsi_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pepsi_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout pepsiLayout = new javax.swing.GroupLayout(pepsi);
        pepsi.setLayout(pepsiLayout);
        pepsiLayout.setHorizontalGroup(
            pepsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pepsiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pepsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pepsiLayout.createSequentialGroup()
                        .addComponent(pepsi_image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(pepsi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pepsiLayout.setVerticalGroup(
            pepsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pepsiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pepsi_image, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pepsi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(frenchFries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(coke, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(pepsi, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chickenBurrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(shawarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rolex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cheeseburger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(doubleBeefBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(friedChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(friedChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(doubleBeefBurger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(Cheeseburger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chickenBurrito, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addComponent(shawarma, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addComponent(rolex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(frenchFries, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(coke, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                    .addComponent(pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cart_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(cart_table);
        if (cart_table.getColumnModel().getColumnCount() > 0) {
            cart_table.getColumnModel().getColumn(0).setPreferredWidth(140);
        }

        recieptView_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout recieptView_panelLayout = new javax.swing.GroupLayout(recieptView_panel);
        recieptView_panel.setLayout(recieptView_panelLayout);
        recieptView_panelLayout.setHorizontalGroup(
            recieptView_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        recieptView_panelLayout.setVerticalGroup(
            recieptView_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        jLabel7.setText("SubTotal:");

        subtotal_labrl.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        subtotal_labrl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subtotal_labrl.setText("0");

        jLabel9.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 26)); // NOI18N
        jLabel9.setText("Total:");

        total_label.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 26)); // NOI18N
        total_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_label.setText("0");

        jLabel11.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 26)); // NOI18N
        jLabel11.setText("Cash:");

        jLabel13.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        jLabel13.setText("Tax $:");

        tax_label.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        tax_label.setText("0");

        jLabel14.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        jLabel14.setText("Dis $:");

        discount_btn.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        discount_btn.setText("0");

        pay_btn.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 24)); // NOI18N
        pay_btn.setText("Pay");

        jLabel15.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        jLabel15.setText("Balance:");

        jTextField3.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        jTextField3.setText("0");

        printReciept_btn.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 24)); // NOI18N
        printReciept_btn.setText("Print");

        jTextField4.setFont(new java.awt.Font("Ubuntu Sans Mono", 1, 20)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(subtotal_labrl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(tax_label, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(discount_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pay_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(printReciept_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57))))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(printReciept_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(subtotal_labrl)
                                    .addComponent(jLabel13)
                                    .addComponent(tax_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(discount_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(total_label))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pay_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(recieptView_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(484, 484, 484)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(recieptView_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheeseburgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheeseburgerMouseClicked
        String name = "Cheeseburger";
        Double price = 3.99;
        
        AddToCart(name, price);       
       
    }//GEN-LAST:event_CheeseburgerMouseClicked

    private void doubleBeefBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doubleBeefBurgerMouseClicked
        String name = "Double Beef Burger";
        Double price = 5.49;
        
        AddToCart(name, price);       
    }//GEN-LAST:event_doubleBeefBurgerMouseClicked

    private void friedChickenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friedChickenMouseClicked
        String name = "Fried Chicken";
        Double price = 4.99;
        
        AddToCart(name, price);       
    }//GEN-LAST:event_friedChickenMouseClicked

    private void chickenBurritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chickenBurritoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chickenBurritoKeyPressed

    private void chickenBurritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chickenBurritoMouseClicked
        String name = "Chicken Burrito";
        Double price = 5.99;
        
        AddToCart(name, price); 
    }//GEN-LAST:event_chickenBurritoMouseClicked

    private void frenchFriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frenchFriesMouseClicked
        String name = "French Fries";
        Double price = 2.29;
        
        AddToCart(name, price); 
    }//GEN-LAST:event_frenchFriesMouseClicked

    private void frenchFriesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frenchFriesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_frenchFriesKeyPressed

    private void cokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cokeMouseClicked
        String name = "Cocacola";
        Double price = 1.99;
        
        AddToCart(name, price); 
    }//GEN-LAST:event_cokeMouseClicked

    private void cokeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cokeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeKeyPressed

    private void pepsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pepsiMouseClicked
        String name = "Pepsi";
        Double price = 1.99;
        
        AddToCart(name, price); 
    }//GEN-LAST:event_pepsiMouseClicked

    private void pepsiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pepsiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pepsiKeyPressed

    private void shawarmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shawarmaMouseClicked
        String name = "Shawarma";
        Double price = 3.45;
        
        AddToCart(name, price); 
    }//GEN-LAST:event_shawarmaMouseClicked

    private void rolexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolexMouseClicked
        String name = "Rolex";
        Double price = 1.15;
        
        AddToCart(name, price); 
    }//GEN-LAST:event_rolexMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new mainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cheeseburger;
    private javax.swing.JTable cart_table;
    private javax.swing.JLabel cheeseburger_image;
    private javax.swing.JLabel cheeseburger_label;
    private javax.swing.JPanel chickenBurrito;
    private javax.swing.JLabel chickenBurrito_image;
    private javax.swing.JLabel chickenburrito_label;
    private javax.swing.JPanel coke;
    private javax.swing.JLabel coke_image;
    private javax.swing.JLabel coke_label;
    private javax.swing.JTextField discount_btn;
    private javax.swing.JPanel doubleBeefBurger;
    private javax.swing.JLabel doubleBeefBurger_image;
    private javax.swing.JLabel doubleCheeseburger_label;
    private javax.swing.JPanel frenchFries;
    private javax.swing.JLabel frenchFries_image;
    private javax.swing.JLabel frenchFries_label;
    private javax.swing.JPanel friedChicken;
    private javax.swing.JLabel friedChicken_image;
    private javax.swing.JLabel friedchicken_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton pay_btn;
    private javax.swing.JPanel pepsi;
    private javax.swing.JLabel pepsi_image;
    private javax.swing.JLabel pepsi_label;
    private javax.swing.JButton printReciept_btn;
    private javax.swing.JPanel recieptView_panel;
    private javax.swing.JPanel rolex;
    private javax.swing.JLabel rolex_label;
    private javax.swing.JPanel shawarma;
    private javax.swing.JLabel shawarma_image;
    private javax.swing.JLabel shawarma_label;
    private javax.swing.JLabel shawarma_label1;
    private javax.swing.JLabel subtotal_labrl;
    private javax.swing.JTextField tax_label;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
