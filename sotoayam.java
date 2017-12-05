private void cboxSotoAyamtActionPerformed(java.awt.event.ActionEvent evt) {
      if (cboxAyamPenyet.isSelected() == true){
           txtJlhSotoAyam.setEditable(true);
           txtJlhSotoAyam.requestFocus();
      }
      else {
           txtJlhSotoAyam.setEditable(true);
           txtJlhSotoAyam.requestFocus();
           lblTHargaSotoAyam.setText("Rp.0,-");
      }
}
