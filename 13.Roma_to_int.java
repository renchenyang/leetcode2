public int romanToInt(String s) {
  int r = 0;
  if (s.indexOf("IV") != -1) {r -= 2;}
  if (s.indexOf("IX") != -1) {r -= 2;}
  if (s.indexOf("XL") != -1) {r -= 20;}
  if (s.indexOf("XC") != -1) {r -= 20;}
  if (s.indexOf("CD") != -1) {r -= 200;}
  if (s.indexOf("CM") != -1) {r -= 200;}
  char c[] = s.toCharArray();
  int i = 0;
  for (; i < s.length(); i++) {
    if (c[i] == 'M') r += 1000;
    if (c[i] == 'D') r += 500;
    if (c[i] == 'C') r += 100;
    if (c[i] == 'L') r += 50;
    if (c[i] == 'X') r += 10;
    if (c[i] == 'V') r += 5;
    if (c[i] == 'I') r += 1;
  }
  return r;
}