
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Oct 31 12:33:10 CST 2022
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Oct 31 12:33:10 CST 2022
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\064\000\002\002\004\000\002\002\004\000\002\002" +
    "\004\000\002\002\004\000\002\003\005\000\002\004\004" +
    "\000\002\005\005\000\002\005\002\000\002\007\007\000" +
    "\002\006\003\000\002\006\003\000\002\012\004\000\002" +
    "\012\005\000\002\013\003\000\002\013\004\000\002\014" +
    "\011\000\002\016\005\000\002\016\002\000\002\017\006" +
    "\000\002\017\002\000\002\021\004\000\002\021\004\000" +
    "\002\021\004\000\002\021\004\000\002\021\004\000\002" +
    "\021\004\000\002\021\002\000\002\026\012\000\002\027" +
    "\006\000\002\027\002\000\002\031\011\000\002\030\015" +
    "\000\002\032\011\000\002\022\007\000\002\022\005\000" +
    "\002\023\003\000\002\023\003\000\002\023\003\000\002" +
    "\023\004\000\002\023\004\000\002\023\004\000\002\023" +
    "\005\000\002\023\005\000\002\023\005\000\002\024\004" +
    "\000\002\025\004\000\002\025\004\000\002\025\004\000" +
    "\002\025\005\000\002\025\005\000\002\025\005\000\002" +
    "\025\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\202\000\006\021\010\023\011\001\002\000\006\021" +
    "\010\023\011\001\002\000\006\021\010\023\011\001\002" +
    "\000\004\002\202\001\002\000\006\021\010\023\011\001" +
    "\002\000\010\021\010\023\017\042\020\001\002\000\010" +
    "\021\010\023\017\042\016\001\002\000\004\026\177\001" +
    "\002\000\012\017\ufff4\021\ufff4\023\ufff4\042\ufff4\001\002" +
    "\000\004\042\020\001\002\000\004\017\175\001\002\000" +
    "\012\004\051\026\ufffa\027\052\030\021\001\002\000\010" +
    "\021\010\023\017\042\020\001\002\000\004\030\021\001" +
    "\002\000\006\023\023\031\ufff0\001\002\000\004\031\032" +
    "\001\002\000\004\042\024\001\002\000\006\004\026\031" +
    "\uffee\001\002\000\004\031\ufff1\001\002\000\004\023\027" +
    "\001\002\000\004\042\030\001\002\000\006\004\026\031" +
    "\uffee\001\002\000\004\031\uffef\001\002\000\004\034\033" +
    "\001\002\000\014\016\036\020\034\022\040\023\046\035" +
    "\uffe7\001\002\000\004\030\157\001\002\000\020\006\uffe7" +
    "\012\uffe7\016\036\020\034\022\040\023\046\035\uffe7\001" +
    "\002\000\004\030\143\001\002\000\022\006\uffe7\012\uffe7" +
    "\016\036\020\034\022\040\023\046\030\131\035\uffe7\001" +
    "\002\000\004\030\066\001\002\000\004\035\065\001\002" +
    "\000\020\006\uffe7\012\uffe7\016\036\020\034\022\040\023" +
    "\046\035\uffe7\001\002\000\020\006\uffe7\012\uffe7\016\036" +
    "\020\034\022\040\023\046\035\uffe7\001\002\000\020\006" +
    "\uffe7\012\uffe7\016\036\020\034\022\040\023\046\035\uffe7" +
    "\001\002\000\020\006\uffe7\012\uffe7\016\036\020\034\022" +
    "\040\023\046\035\uffe7\001\002\000\004\042\047\001\002" +
    "\000\010\004\051\026\ufffa\027\052\001\002\000\004\026" +
    "\ufffc\001\002\000\004\042\057\001\002\000\006\043\055" +
    "\044\053\001\002\000\004\026\ufff7\001\002\000\004\026" +
    "\056\001\002\000\004\026\ufff8\001\002\000\022\006\ufff9" +
    "\012\ufff9\016\ufff9\020\ufff9\021\ufff9\022\ufff9\023\ufff9\035" +
    "\ufff9\001\002\000\006\004\051\026\ufffa\001\002\000\004" +
    "\026\ufffb\001\002\000\010\006\uffe8\012\uffe8\035\uffe8\001" +
    "\002\000\010\006\uffec\012\uffec\035\uffec\001\002\000\010" +
    "\006\uffeb\012\uffeb\035\uffeb\001\002\000\010\006\uffed\012" +
    "\uffed\035\uffed\001\002\000\012\017\ufff2\021\ufff2\023\ufff2" +
    "\042\ufff2\001\002\000\012\025\070\042\072\043\073\044" +
    "\067\001\002\000\012\024\074\026\uffdd\031\uffdd\037\uffdd" +
    "\001\002\000\010\042\122\043\123\044\121\001\002\000" +
    "\004\031\115\001\002\000\012\024\074\026\uffde\031\uffde" +
    "\037\uffde\001\002\000\012\024\074\026\uffdc\031\uffdc\037" +
    "\uffdc\001\002\000\020\025\077\026\uffce\031\uffce\037\uffce" +
    "\042\100\043\102\044\076\001\002\000\010\026\uffd9\031" +
    "\uffd9\037\uffd9\001\002\000\004\024\074\001\002\000\010" +
    "\042\106\043\107\044\105\001\002\000\004\024\074\001" +
    "\002\000\010\026\uffd5\031\uffd5\037\uffd5\001\002\000\004" +
    "\024\074\001\002\000\010\026\uffd2\031\uffd2\037\uffd2\001" +
    "\002\000\010\026\uffd4\031\uffd4\037\uffd4\001\002\000\004" +
    "\024\074\001\002\000\004\024\074\001\002\000\004\024" +
    "\074\001\002\000\010\026\uffcf\031\uffcf\037\uffcf\001\002" +
    "\000\010\026\uffd1\031\uffd1\037\uffd1\001\002\000\010\026" +
    "\uffd0\031\uffd0\037\uffd0\001\002\000\010\026\uffd3\031\uffd3" +
    "\037\uffd3\001\002\000\010\026\uffdb\031\uffdb\037\uffdb\001" +
    "\002\000\004\034\116\001\002\000\014\016\036\020\034" +
    "\022\040\023\046\035\uffe7\001\002\000\004\035\120\001" +
    "\002\000\020\006\uffe3\012\uffe3\016\uffe3\020\uffe3\022\uffe3" +
    "\023\uffe3\035\uffe3\001\002\000\004\024\074\001\002\000" +
    "\004\024\074\001\002\000\004\024\074\001\002\000\010" +
    "\026\uffd6\031\uffd6\037\uffd6\001\002\000\010\026\uffd8\031" +
    "\uffd8\037\uffd8\001\002\000\010\026\uffd7\031\uffd7\037\uffd7" +
    "\001\002\000\010\026\uffda\031\uffda\037\uffda\001\002\000" +
    "\010\006\uffe9\012\uffe9\035\uffe9\001\002\000\012\025\070" +
    "\042\072\043\073\044\067\001\002\000\004\026\133\001" +
    "\002\000\012\025\070\042\072\043\073\044\067\001\002" +
    "\000\004\026\135\001\002\000\012\025\070\042\072\043" +
    "\073\044\067\001\002\000\004\031\137\001\002\000\004" +
    "\034\140\001\002\000\014\016\036\020\034\022\040\023" +
    "\046\035\uffe7\001\002\000\004\035\142\001\002\000\022" +
    "\006\uffe2\012\uffe2\016\uffe2\020\uffe2\022\uffe2\023\uffe2\030" +
    "\uffe2\035\uffe2\001\002\000\012\025\070\042\072\043\073" +
    "\044\067\001\002\000\004\031\145\001\002\000\004\034" +
    "\146\001\002\000\014\016\036\020\034\022\040\023\046" +
    "\035\uffe7\001\002\000\004\035\150\001\002\000\022\006" +
    "\uffe4\012\uffe4\014\152\016\uffe4\020\uffe4\022\uffe4\023\uffe4" +
    "\035\uffe4\001\002\000\020\006\uffe6\012\uffe6\016\uffe6\020" +
    "\uffe6\022\uffe6\023\uffe6\035\uffe6\001\002\000\004\034\153" +
    "\001\002\000\014\016\036\020\034\022\040\023\046\035" +
    "\uffe7\001\002\000\004\035\155\001\002\000\020\006\uffe5" +
    "\012\uffe5\016\uffe5\020\uffe5\022\uffe5\023\uffe5\035\uffe5\001" +
    "\002\000\010\006\uffea\012\uffea\035\uffea\001\002\000\012" +
    "\025\070\042\072\043\073\044\067\001\002\000\004\031" +
    "\161\001\002\000\004\034\162\001\002\000\006\006\163" +
    "\012\164\001\002\000\012\025\070\042\072\043\073\044" +
    "\067\001\002\000\004\037\167\001\002\000\004\035\166" +
    "\001\002\000\020\006\uffe1\012\uffe1\016\uffe1\020\uffe1\022" +
    "\uffe1\023\uffe1\035\uffe1\001\002\000\014\016\036\020\034" +
    "\022\040\023\046\035\uffe7\001\002\000\004\035\uffdf\001" +
    "\002\000\004\037\172\001\002\000\016\006\uffe7\012\uffe7" +
    "\016\036\020\034\022\040\023\046\001\002\000\006\006" +
    "\163\012\164\001\002\000\004\035\uffe0\001\002\000\010" +
    "\021\ufff5\023\ufff5\042\ufff5\001\002\000\012\017\ufff3\021" +
    "\ufff3\023\ufff3\042\ufff3\001\002\000\022\006\ufffd\012\ufffd" +
    "\016\ufffd\020\ufffd\021\ufffd\022\ufffd\023\ufffd\035\ufffd\001" +
    "\002\000\010\021\ufff6\023\ufff6\042\ufff6\001\002\000\004" +
    "\002\uffff\001\002\000\004\002\001\001\002\000\004\002" +
    "\ufffe\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\202\000\012\002\005\003\003\007\006\012\004\001" +
    "\001\000\012\002\203\003\003\007\006\012\004\001\001" +
    "\000\012\002\202\003\003\007\006\012\004\001\001\000" +
    "\002\001\001\000\012\002\200\003\003\007\006\012\004" +
    "\001\001\000\010\012\013\013\177\014\012\001\001\000" +
    "\012\004\011\012\013\013\014\014\012\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\014\175\001\001\000" +
    "\002\001\001\000\004\005\047\001\001\000\010\012\013" +
    "\013\014\014\012\001\001\000\002\001\001\000\004\016" +
    "\021\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\017\024\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\017\030\001\001\000\002\001\001" +
    "\000\002\001\001\000\020\003\041\007\043\021\040\026" +
    "\042\030\036\031\034\032\044\001\001\000\002\001\001" +
    "\000\020\003\041\007\043\021\155\026\042\030\036\031" +
    "\034\032\044\001\001\000\002\001\001\000\020\003\041" +
    "\007\043\021\127\026\042\030\036\031\034\032\044\001" +
    "\001\000\002\001\001\000\002\001\001\000\020\003\041" +
    "\007\043\021\063\026\042\030\036\031\034\032\044\001" +
    "\001\000\020\003\041\007\043\021\062\026\042\030\036" +
    "\031\034\032\044\001\001\000\020\003\041\007\043\021" +
    "\061\026\042\030\036\031\034\032\044\001\001\000\020" +
    "\003\041\007\043\021\060\026\042\030\036\031\034\032" +
    "\044\001\001\000\004\004\011\001\001\000\004\005\047" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\053\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\057\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\023" +
    "\070\001\001\000\004\024\126\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\024\113\001\001\000\004\024" +
    "\074\001\001\000\004\025\100\001\001\000\002\001\001" +
    "\000\004\024\112\001\001\000\002\001\001\000\004\024" +
    "\103\001\001\000\002\001\001\000\004\024\102\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\024\111\001" +
    "\001\000\004\024\110\001\001\000\004\024\107\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\020" +
    "\003\041\007\043\021\116\026\042\030\036\031\034\032" +
    "\044\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\024\125\001\001\000\004\024\124\001\001\000\004\024" +
    "\123\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\023" +
    "\131\001\001\000\002\001\001\000\004\023\133\001\001" +
    "\000\002\001\001\000\004\023\135\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\003\041\007\043\021\140" +
    "\026\042\030\036\031\034\032\044\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\023\143\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\003\041\007\043\021" +
    "\146\026\042\030\036\031\034\032\044\001\001\000\002" +
    "\001\001\000\004\027\150\001\001\000\002\001\001\000" +
    "\002\001\001\000\020\003\041\007\043\021\153\026\042" +
    "\030\036\031\034\032\044\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\023\157\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\022\164\001" +
    "\001\000\004\023\170\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\003\041\007\043\021" +
    "\167\026\042\030\036\031\034\032\044\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\003\041\007\043\021" +
    "\172\026\042\030\036\031\034\032\044\001\001\000\004" +
    "\022\173\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // EXPRESION_P2 ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // EXPRESION_P2 ::= Op_Una Entero EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // EXPRESION_P2 ::= Op_Una Caracter EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // EXPRESION_P2 ::= Op_Una Identificador EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // EXPRESION_P2 ::= Entero EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // EXPRESION_P2 ::= Caracter EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // EXPRESION_P2 ::= Identificador EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P2",19, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // EXPRESION_P ::= Op_Bin EXPRESION_P2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION_P",18, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // EXPRESION ::= Op_Una Entero EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // EXPRESION ::= Op_Una Caracter EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // EXPRESION ::= Op_Una Identificador EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // EXPRESION ::= Entero EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // EXPRESION ::= Caracter EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // EXPRESION ::= Identificador EXPRESION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // EXPRESION ::= Entero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // EXPRESION ::= Caracter 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // EXPRESION ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",17, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // STMT_S ::= Default Dos_Puntos STMT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT_S",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // STMT_S ::= Case EXPRESION Dos_Puntos STMT STMT_S 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT_S",16, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SWITCH ::= Switch Parentesis_Izquierdo EXPRESION Parentesis_Derecho Corchete_Izquierdo STMT_S Corchete_Derecho 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SWITCH",24, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // FOR ::= FOR Parentesis_Izquierdo EXPRESION Puntoycoma EXPRESION Puntoycoma EXPRESION Parentesis_Derecho Corchete_Izquierdo STMT Corchete_Derecho 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",22, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // WHILE ::= While Parentesis_Izquierdo EXPRESION Parentesis_Derecho Corchete_Izquierdo STMT Corchete_Derecho 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",23, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ELSE ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ELSE",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ELSE ::= Else Corchete_Izquierdo STMT Corchete_Derecho 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ELSE",21, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // IF ::= If Parentesis_Izquierdo EXPRESION Parentesis_Derecho Corchete_Izquierdo STMT Corchete_Derecho ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",20, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // STMT ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // STMT ::= SWITCH STMT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // STMT ::= FOR STMT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // STMT ::= WHILE STMT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // STMT ::= IF STMT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // STMT ::= DECLARACION_IMPLEMENTACION STMT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // STMT ::= DECLARACION STMT 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("STMT",15, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // LISTA_SIM ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA_SIM",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // LISTA_SIM ::= Coma TDato Identificador LISTA_SIM 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA_SIM",13, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION_SIMPLE ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_SIMPLE",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION_SIMPLE ::= TDato Identificador LISTA_SIM 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_SIMPLE",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // FUNCION_P2 ::= Identificador Parentesis_Izquierdo DECLARACION_SIMPLE Parentesis_Derecho Corchete_Izquierdo STMT Corchete_Derecho 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION_P2",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // FUNCION_P ::= FUNCION FUNCION_P2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION_P",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FUNCION_P ::= FUNCION_P2 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION_P",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // FUNCION ::= TDato FUNCION_P Return 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // FUNCION ::= _Void FUNCION_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DATO ::= Caracter 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DATO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DATO ::= Entero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DATO",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECLARACION_IMPLEMENTACION ::= TDato Identificador Asignacion DATO Puntoycoma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_IMPLEMENTACION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LISTA_ID_P ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA_ID_P",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // LISTA_ID_P ::= Coma Identificador LISTA_ID_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA_ID_P",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LISTA_ID ::= Identificador LISTA_ID_P 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LISTA_ID",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DECLARACION ::= TDato LISTA_ID Puntoycoma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= FUNCION INICIO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= DECLARACION_IMPLEMENTACION INICIO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= DECLARACION INICIO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

