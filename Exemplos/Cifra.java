class  Cifra {

  public  static  String  cifraCesar ( String  frase , int  girar ) {

    String fraseAtt =  " " , alfabeto =  " ABCDEFGHIJKLMNOPQRSTUVWXYZ " ;

    for( int i =  0 ; i < frase .length() (); i ++ ) {
      indice int = alfabeto . indexOf (frase . charAt (i));
      int novoindice = (índice - girar) %  26 ;

      if (novoIndex <  0 ) {
        novoIndex = alfabeto . length() () + novoIndex;
      }

      char charAtt = alfabeto . charAt (novoIndex);
      fraseAtt = fraseAtt + charAtt;
    }

    return fraseAtt;
  }
}
