private void cboxNasiGorengtActionPerformed(java.awt.event.ActionEvent evt) {
      if (cboxAyamPenyet.isSelected() == true){
           txtJlhNasiGoreng.setEditable(true);
           txtJlhNasiGoreng.requestFocus();
      }
      else {
           txtJlhNasiGoreng.setEditable(true);
           txtJlhNasiGoreng.requestFocus();
           lblTHargaNasiGoreng.setText("Rp.0,-");
      }
}
