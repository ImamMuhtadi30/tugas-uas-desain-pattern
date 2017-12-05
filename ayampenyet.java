private void cboxMieAyamActionPerformed(java.awt.event.ActionEvent evt) {
      if (cboxMieAyam.isSelected()== true){
           txtJlhMieAyam.setEditable(true);
           txtJlhMieAyam.requestFocus();
      else {
           txtJlhMieAyam.setEditable(false);
           txtjlhMieAyam.setText("");
           lblThargaMieAyam.setText("Rp.0,-");
       }
}

