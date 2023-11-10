public interface Floor {
  int getTotalFlats();
  int getFlatsSquare();
  int getFlatsQuantity();
  Flat[] getFlats();
  Flat getFlat(int index);
  void setFlat(int index, Space newFlat);
  void addFlat(int index, Space newFlat);
  void deleteFlat(int index);
  int getBestSquare();
}
