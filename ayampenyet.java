private void cboxAyamPenyetActionPerformed(java.awt.event.ActionEvent evt) {
      if (cboxAyamPenyet.isSelected() == true){
           txtJlhAyamPenyet.setEditable(true);
           txtJlhAyamPenyet.requestFocus();
      }
      else {
           txtJlhAyamPenyet.setEditable(true);
           txtJlhAyamPenyet.requestFocus();
           lblTHargaAyamPenyet.setText("Rp.0,-");
      }
}
