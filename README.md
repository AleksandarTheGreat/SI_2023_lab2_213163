# SI_2023_lab2_213163

# Aleksandar Mitrevski 213163

# Control flow graph

![SI_lab2_graph drawio](https://github.com/AleksandarTheGreat/SI_2023_lab2_213163/assets/126021512/8dad36ed-87f9-413b-bc62-ffe1c1238ecd)

# Ciklomatska kompleksnost
32 granki
26 teminja
Ciklomatskata kompleksnost e 8, ja dobiv po formulata P+2 kade shto P
e razlikata megu brojot na granki i brojot na teminja: 32 - 26 = 6 + 2 = 8

# Multiple Condition 
if (user==null || user.getPassword()==null || user.getEmail()==null)

Imame 8 test sluchaevi, toa se:

1: Site tri uslovi se false;
  - user != null
  - user.getPassword() != null
  - user.getEmail() != null

2: Samo poseldniot uslov e true, drugite se false
  - user != null
  - user.getPassword() != null
  - user.getEmail() == null

3: Samo sredniot uslov e true, drugite 2 se false
  - user != null
  - user.getPassword() == null
  - user.getEmail() != null
  
4: Samo prviot uslov e false, drugite 2 se true
  - user != null
  - user.getPassword() == null
  - user.getEmail() == null

5: Samo prviot uslov e true, drugite 2 se false
  - user == null
  - user.getPassword() != null
  - user.getEmail() != null

6: Prviot i tretiot uslov se true, sredniot e false
  - user == null
  - user.getPassword() != null
  - user.getEmail() == null

7: Prviot i vtoriot uslov e true, tretiot e false
  - user == null
  - user.getPassword() == null
  - user.getEmail() != null

8: Site se true.
  - user == null
  - user.getPassword() == null
  - user.getEmail() == nul
