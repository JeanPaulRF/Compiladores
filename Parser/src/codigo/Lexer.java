/* The following code was generated by JFlex 1.4.3 on 9/25/22, 10:35 AM */

package codigo;
import java.io.*;
import static codigo.Tokens.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/25/22, 10:35 AM from the specification file
 * <tt>src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\41\2\0\1\6\22\0\1\5\1\55\1\73\1\72"+
    "\1\0\1\46\1\50\1\71\1\61\1\62\1\42\1\54\1\7\1\53"+
    "\1\70\1\40\1\43\7\3\2\2\1\67\1\57\1\45\1\47\1\44"+
    "\1\60\1\0\6\4\5\1\1\1\16\1\1\63\1\0\1\64\1\51"+
    "\1\1\1\0\1\10\1\14\1\20\1\25\1\16\1\26\1\32\1\22"+
    "\1\24\1\1\1\17\1\27\1\30\1\23\1\13\1\36\1\1\1\15"+
    "\1\21\1\12\1\11\1\37\1\34\1\31\1\35\1\33\1\65\1\52"+
    "\1\66\1\56\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\5\17\2\1\6"+
    "\1\7\1\3\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\3\1"+
    "\1\35\2\0\17\2\2\36\6\2\1\4\1\37\1\40"+
    "\1\41\1\42\1\43\1\35\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\2\0\1\65\1\66"+
    "\1\0\1\67\1\0\1\70\30\2\2\71\1\72\1\73"+
    "\1\66\3\0\16\2\1\0\1\74\7\2\1\0\2\2"+
    "\1\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\u01a4"+
    "\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348\0\u0384"+
    "\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0\0\u04ec\0\u0528\0\u0564"+
    "\0\u05a0\0\u05dc\0\u0618\0\u0654\0\u0690\0\u06cc\0\u0708\0\u0744"+
    "\0\u0780\0\u07bc\0\u07f8\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\74\0\74\0\74\0\74\0\74\0\u0834\0\u0870"+
    "\0\u08ac\0\u08e8\0\u0924\0\u0960\0\u099c\0\u09d8\0\u0a14\0\u0a50"+
    "\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30"+
    "\0\u0c6c\0\u0ca8\0\u0ce4\0\170\0\u0d20\0\u0d5c\0\u0d98\0\u0dd4"+
    "\0\u0e10\0\u0e4c\0\u0e88\0\u0ec4\0\74\0\74\0\74\0\74"+
    "\0\u0f00\0\u0f3c\0\u0f78\0\74\0\u0fb4\0\74\0\74\0\74"+
    "\0\74\0\74\0\74\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\74\0\74\0\u0ff0\0\u102c\0\u1068\0\u10a4\0\u08ac"+
    "\0\u10e0\0\u111c\0\u1158\0\u1194\0\u11d0\0\u120c\0\u1248\0\u1284"+
    "\0\u12c0\0\u12fc\0\u1338\0\u1374\0\u13b0\0\u13ec\0\u1428\0\u1464"+
    "\0\u14a0\0\u14dc\0\u1518\0\u1554\0\u1590\0\u15cc\0\u1608\0\u1644"+
    "\0\u1680\0\u16bc\0\u16f8\0\74\0\u08e8\0\74\0\74\0\74"+
    "\0\u1734\0\u1770\0\u17ac\0\u17e8\0\u1824\0\u1860\0\u189c\0\u18d8"+
    "\0\u1914\0\u1950\0\u198c\0\u19c8\0\u1a04\0\u1a40\0\u1a7c\0\u1ab8"+
    "\0\u1af4\0\u1b30\0\u17ac\0\u1b6c\0\u1ba8\0\u1be4\0\u1c20\0\u1c5c"+
    "\0\u1c98\0\u1cd4\0\u1d10\0\u1d4c\0\u1d88\0\74";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\3\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\3\1\13\1\14\1\15\1\3\1\16"+
    "\1\17\2\3\1\20\1\21\1\22\1\23\2\3\1\24"+
    "\1\3\1\25\2\3\1\26\1\27\1\6\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
    "\75\0\4\3\3\0\30\3\3\0\1\3\31\0\1\62"+
    "\2\4\1\62\3\0\30\62\3\0\1\4\7\0\1\63"+
    "\14\0\1\64\10\0\1\5\1\0\1\5\72\0\2\6"+
    "\31\0\1\6\37\0\1\5\1\6\1\7\31\0\1\6"+
    "\33\0\4\3\3\0\1\3\1\65\26\3\3\0\1\3"+
    "\31\0\4\3\3\0\13\3\1\66\14\3\3\0\1\3"+
    "\31\0\4\3\3\0\25\3\1\67\2\3\3\0\1\3"+
    "\31\0\4\3\3\0\5\3\1\70\22\3\3\0\1\3"+
    "\31\0\4\3\3\0\6\3\1\71\21\3\3\0\1\3"+
    "\31\0\4\3\3\0\13\3\1\72\3\3\1\73\1\3"+
    "\1\74\6\3\3\0\1\3\31\0\4\3\3\0\1\73"+
    "\2\3\1\75\6\3\1\76\15\3\3\0\1\3\31\0"+
    "\4\3\3\0\2\3\1\77\7\3\1\100\1\3\1\101"+
    "\7\3\1\102\3\3\3\0\1\3\31\0\4\3\3\0"+
    "\13\3\1\103\2\3\1\104\11\3\3\0\1\3\31\0"+
    "\4\3\3\0\3\3\1\105\2\3\1\106\21\3\3\0"+
    "\1\3\31\0\4\3\3\0\3\3\1\107\13\3\1\110"+
    "\10\3\3\0\1\3\31\0\4\3\3\0\3\3\1\111"+
    "\24\3\3\0\1\3\31\0\4\3\3\0\3\3\1\65"+
    "\24\3\3\0\1\3\31\0\4\3\3\0\12\3\1\112"+
    "\15\3\3\0\1\3\31\0\4\3\3\0\3\3\1\113"+
    "\24\3\3\0\1\3\70\0\1\114\1\0\1\115\4\0"+
    "\1\116\64\0\1\117\6\0\1\120\25\0\1\62\1\4"+
    "\1\121\1\62\3\0\21\62\1\122\6\62\3\0\1\121"+
    "\7\0\1\63\14\0\1\64\47\0\1\123\2\0\1\124"+
    "\71\0\1\125\1\0\1\126\73\0\1\127\73\0\1\130"+
    "\73\0\1\131\1\132\72\0\1\133\73\0\1\134\2\0"+
    "\1\135\65\0\1\136\2\0\1\137\3\0\1\140\67\0"+
    "\1\141\4\0\1\142\66\0\1\143\24\0\71\144\1\145"+
    "\2\144\1\0\1\146\2\147\1\146\3\0\30\146\3\0"+
    "\1\147\30\0\73\150\1\151\1\0\1\62\2\0\1\62"+
    "\3\0\30\62\77\0\1\152\32\0\2\153\37\0\1\153"+
    "\31\0\4\3\3\0\2\3\1\154\25\3\3\0\1\3"+
    "\31\0\4\3\3\0\11\3\1\155\2\3\1\156\13\3"+
    "\3\0\1\3\31\0\4\3\3\0\26\3\1\157\1\3"+
    "\3\0\1\3\31\0\4\3\3\0\6\3\1\160\21\3"+
    "\3\0\1\3\31\0\4\3\3\0\2\3\1\161\17\3"+
    "\1\162\5\3\3\0\1\3\31\0\4\3\3\0\1\3"+
    "\1\163\26\3\3\0\1\3\31\0\4\3\3\0\11\3"+
    "\1\164\16\3\3\0\1\3\31\0\4\3\3\0\2\3"+
    "\1\165\25\3\3\0\1\3\31\0\4\3\3\0\13\3"+
    "\1\166\14\3\3\0\1\3\31\0\4\3\3\0\1\107"+
    "\27\3\3\0\1\3\31\0\4\3\3\0\1\167\4\3"+
    "\1\170\22\3\3\0\1\3\31\0\4\3\3\0\3\3"+
    "\1\171\24\3\3\0\1\3\31\0\4\3\3\0\22\3"+
    "\1\172\1\173\4\3\3\0\1\3\31\0\4\3\3\0"+
    "\14\3\1\174\13\3\3\0\1\3\31\0\4\3\3\0"+
    "\2\3\1\104\25\3\3\0\1\3\31\0\4\3\3\0"+
    "\1\3\1\175\26\3\3\0\1\3\31\0\4\3\3\0"+
    "\16\3\1\176\11\3\3\0\1\3\31\0\4\3\3\0"+
    "\5\3\1\104\22\3\3\0\1\3\31\0\4\3\3\0"+
    "\3\3\1\177\24\3\3\0\1\3\31\0\4\3\3\0"+
    "\13\3\1\200\14\3\3\0\1\3\31\0\4\3\3\0"+
    "\14\3\1\201\13\3\3\0\1\3\31\0\4\3\3\0"+
    "\14\3\1\202\2\3\1\203\10\3\3\0\1\3\30\0"+
    "\41\114\1\0\32\114\1\0\1\62\1\4\1\121\1\62"+
    "\3\0\30\62\3\0\1\121\7\0\1\63\14\0\1\64"+
    "\4\0\1\62\2\204\1\205\3\0\1\205\3\62\1\205"+
    "\1\62\1\205\1\62\1\205\4\62\2\205\11\62\3\0"+
    "\1\204\77\0\1\206\73\0\1\207\115\0\1\210\73\0"+
    "\1\144\3\0\1\146\2\0\1\146\3\0\30\146\36\0"+
    "\2\147\37\0\1\147\123\0\1\150\2\0\2\211\37\0"+
    "\1\211\15\0\1\212\14\0\2\153\37\0\1\153\24\0"+
    "\1\213\4\0\4\3\3\0\3\3\1\104\24\3\3\0"+
    "\1\3\31\0\4\3\3\0\14\3\1\214\13\3\3\0"+
    "\1\3\31\0\4\3\3\0\3\3\1\215\24\3\3\0"+
    "\1\3\31\0\4\3\3\0\6\3\1\216\21\3\3\0"+
    "\1\3\31\0\4\3\3\0\1\217\27\3\3\0\1\3"+
    "\31\0\4\3\3\0\1\3\1\220\26\3\3\0\1\3"+
    "\31\0\4\3\3\0\14\3\1\221\13\3\3\0\1\3"+
    "\31\0\4\3\3\0\20\3\1\104\7\3\3\0\1\3"+
    "\31\0\4\3\3\0\6\3\1\104\21\3\3\0\1\3"+
    "\31\0\4\3\3\0\6\3\1\220\21\3\3\0\1\3"+
    "\31\0\4\3\3\0\2\3\1\222\6\3\1\103\16\3"+
    "\3\0\1\3\31\0\4\3\3\0\2\3\1\223\25\3"+
    "\3\0\1\3\31\0\4\3\3\0\1\3\1\224\26\3"+
    "\3\0\1\3\31\0\4\3\3\0\5\3\1\103\22\3"+
    "\3\0\1\3\31\0\4\3\3\0\13\3\1\225\14\3"+
    "\3\0\1\3\31\0\4\3\3\0\6\3\1\226\21\3"+
    "\3\0\1\3\31\0\4\3\3\0\2\3\1\227\25\3"+
    "\3\0\1\3\31\0\4\3\3\0\4\3\1\201\23\3"+
    "\3\0\1\3\31\0\4\3\3\0\1\230\27\3\3\0"+
    "\1\3\31\0\4\3\3\0\1\103\27\3\3\0\1\3"+
    "\31\0\4\3\3\0\22\3\1\104\5\3\3\0\1\3"+
    "\31\0\4\3\3\0\17\3\1\164\10\3\3\0\1\3"+
    "\31\0\4\3\3\0\15\3\1\104\12\3\3\0\1\3"+
    "\31\0\4\3\3\0\1\231\27\3\3\0\1\3\32\0"+
    "\2\211\37\0\1\211\7\0\1\63\73\0\1\232\22\0"+
    "\2\233\37\0\1\233\31\0\4\3\3\0\22\3\1\172"+
    "\5\3\3\0\1\3\31\0\4\3\3\0\13\3\1\104"+
    "\14\3\3\0\1\3\31\0\4\3\3\0\15\3\1\234"+
    "\12\3\3\0\1\3\31\0\4\3\3\0\7\3\1\104"+
    "\20\3\3\0\1\3\31\0\4\3\3\0\5\3\1\215"+
    "\22\3\3\0\1\3\31\0\4\3\3\0\11\3\1\235"+
    "\16\3\3\0\1\3\31\0\4\3\3\0\14\3\1\236"+
    "\13\3\3\0\1\3\31\0\4\3\3\0\14\3\1\237"+
    "\13\3\3\0\1\3\31\0\4\3\3\0\10\3\1\103"+
    "\17\3\3\0\1\3\31\0\4\3\3\0\6\3\1\202"+
    "\21\3\3\0\1\3\31\0\4\3\3\0\3\3\1\240"+
    "\24\3\3\0\1\3\31\0\4\3\3\0\10\3\1\241"+
    "\17\3\3\0\1\3\31\0\4\3\3\0\1\3\1\242"+
    "\26\3\3\0\1\3\31\0\4\3\3\0\2\3\1\112"+
    "\25\3\3\0\1\3\32\0\2\243\37\0\1\243\31\0"+
    "\4\3\3\0\6\3\1\240\21\3\3\0\1\3\31\0"+
    "\4\3\3\0\2\3\1\244\25\3\3\0\1\3\31\0"+
    "\4\3\3\0\13\3\1\245\14\3\3\0\1\3\31\0"+
    "\4\3\3\0\10\3\1\104\17\3\3\0\1\3\31\0"+
    "\4\3\3\0\16\3\1\104\11\3\3\0\1\3\31\0"+
    "\4\3\3\0\12\3\1\104\15\3\3\0\1\3\31\0"+
    "\4\3\3\0\17\3\1\103\10\3\3\0\1\3\32\0"+
    "\2\243\37\0\1\243\16\0\1\246\12\0\4\3\3\0"+
    "\6\3\1\107\21\3\3\0\1\3\31\0\4\3\3\0"+
    "\1\3\1\164\26\3\3\0\1\3\30\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7620];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\41\1\13\11\4\1\2\0\30\1\4\11"+
    "\3\1\1\11\1\1\16\11\2\0\2\1\1\0\1\1"+
    "\1\0\31\1\1\11\1\1\3\11\3\0\16\1\1\0"+
    "\10\1\1\0\2\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 52: 
          { lexeme=yytext(); return OPERADOR_DIFERENTE;
          }
        case 61: break;
        case 50: 
          { lexeme=yytext(); return OPERADOR_SUMA_ASIGNACION;
          }
        case 62: break;
        case 21: 
          { lexeme=yytext(); return OPERADOR_PARENTESIS_IZQUIERDO;
          }
        case 63: break;
        case 20: 
          { lexeme=yytext(); return OPERADOR_TERNARIO_PREGUNTA;
          }
        case 64: break;
        case 41: 
          { lexeme=yytext(); return OPERADOR_IGUAL;
          }
        case 65: break;
        case 35: 
          { lexeme=yytext(); return LITERAL_OCTAL;
          }
        case 66: break;
        case 42: 
          { lexeme=yytext(); return OPERADOR_AND_ASIGNACION;
          }
        case 67: break;
        case 10: 
          { lexeme=yytext(); return OPERADOR_MODULO;
          }
        case 68: break;
        case 40: 
          { lexeme=yytext(); return OPERADOR_MODULO_ASIGNACION;
          }
        case 69: break;
        case 48: 
          { lexeme=yytext(); return OPERADOR_RESTA_ASIGNACION;
          }
        case 70: break;
        case 23: 
          { lexeme=yytext(); return OPERADOR_PARENTESIS_CUADRADO_IZQUIERDO;
          }
        case 71: break;
        case 16: 
          { lexeme=yytext(); return OPERADOR_SUMA;
          }
        case 72: break;
        case 9: 
          { lexeme=yytext(); return OPERADOR_MENOR;
          }
        case 73: break;
        case 58: 
          { lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_DERECHA_ASIGNACION;
          }
        case 74: break;
        case 5: 
          { lexeme=yytext(); return NEW_LINE;
          }
        case 75: break;
        case 19: 
          { lexeme=yytext(); return OPERADOR_PUNTOYCOMA;
          }
        case 76: break;
        case 47: 
          { lexeme=yytext(); return OPERADOR_MIEMBRO_PUNTERO;
          }
        case 77: break;
        case 25: 
          { lexeme=yytext(); return OPERADOR_CORCHETE_IZQUIERDO;
          }
        case 78: break;
        case 56: 
          { lexeme=yytext(); return LITERAL_FLOAT;
          }
        case 79: break;
        case 55: 
          { lexeme=yytext(); return LITERAL_CADENA;
          }
        case 80: break;
        case 49: 
          { lexeme=yytext(); return OPERADOR_DECREMENTO;
          }
        case 81: break;
        case 32: 
          { lexeme=yytext(); return OPERADOR_DIVISION_ASIGNACION;
          }
        case 82: break;
        case 31: 
          { lexeme=yytext(); return COMENTARIO_INICIO;
          }
        case 83: break;
        case 13: 
          { lexeme=yytext(); return OPERADOR_XOR;
          }
        case 84: break;
        case 45: 
          { lexeme=yytext(); return OPERADOR_OR_ASIGNACION;
          }
        case 85: break;
        case 51: 
          { lexeme=yytext(); return OPERADOR_INCREMENTO;
          }
        case 86: break;
        case 4: 
          { /*Ignore*/;
          }
        case 87: break;
        case 54: 
          { lexeme=yytext(); return LITERAL_CARACTER;
          }
        case 88: break;
        case 38: 
          { lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_IZQUIERDA;
          }
        case 89: break;
        case 33: 
          { lexeme=yytext(); return COMENTARIO_FIN;
          }
        case 90: break;
        case 17: 
          { lexeme=yytext(); return OPERADOR_NOT_LOGICO;
          }
        case 91: break;
        case 6: 
          { lexeme=yytext(); return OPERADOR_DIVISION;
          }
        case 92: break;
        case 37: 
          { lexeme=yytext(); return OPERADOR_MAYOR_IGUAL;
          }
        case 93: break;
        case 7: 
          { lexeme=yytext(); return OPERADOR_MULTIPLICACION;
          }
        case 94: break;
        case 60: 
          { lexeme=yytext(); return ERROR_NUMERICO;
          }
        case 95: break;
        case 53: 
          { lexeme=yytext(); return ERROR_LITERAL;
          }
        case 96: break;
        case 12: 
          { lexeme=yytext(); return OPERADOR_AND;
          }
        case 97: break;
        case 18: 
          { lexeme=yytext(); return OPERADOR_NOT;
          }
        case 98: break;
        case 30: 
          { lexeme=yytext(); return PALABRA_RESERVADA;
          }
        case 99: break;
        case 26: 
          { lexeme=yytext(); return OPERADOR_CORCHETE_DERECHO;
          }
        case 100: break;
        case 3: 
          { lexeme=yytext(); return LITERAL_ENTERO;
          }
        case 101: break;
        case 46: 
          { lexeme=yytext(); return OPERADOR_OR_LOGICO;
          }
        case 102: break;
        case 59: 
          { lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_IZQUIERDA_ASIGNACION;
          }
        case 103: break;
        case 44: 
          { lexeme=yytext(); return OPERADOR_XOR_ASIGNACION;
          }
        case 104: break;
        case 29: 
          { lexeme=yytext(); return ERROR_ALFANUMERICO;
          }
        case 105: break;
        case 43: 
          { lexeme=yytext(); return OPERADOR_AND_LOGICO;
          }
        case 106: break;
        case 2: 
          { lexeme=yytext(); return IDENTIFICADOR;
          }
        case 107: break;
        case 27: 
          { lexeme=yytext(); return OPERADOR_TERNARIO_PUNTOS;
          }
        case 108: break;
        case 28: 
          { lexeme=yytext(); return OPERADOR_PUNTO;
          }
        case 109: break;
        case 22: 
          { lexeme=yytext(); return OPERADOR_PARENTESIS_DERECHO;
          }
        case 110: break;
        case 11: 
          { lexeme=yytext(); return OPERADOR_ASIGNACION;
          }
        case 111: break;
        case 15: 
          { lexeme=yytext(); return OPERADOR_RESTA;
          }
        case 112: break;
        case 8: 
          { lexeme=yytext(); return OPERADOR_MAYOR;
          }
        case 113: break;
        case 24: 
          { lexeme=yytext(); return OPERADOR_PARENTESIS_CUADRADO_DERECHO;
          }
        case 114: break;
        case 36: 
          { lexeme=yytext(); return OPERADOR_DESPLAZAMIENTO_DERECHA;
          }
        case 115: break;
        case 57: 
          { lexeme=yytext(); return LITERAL_HEXADECIMAL;
          }
        case 116: break;
        case 1: 
          { lexeme=yytext(); return ERROR_TOKEN;
          }
        case 117: break;
        case 39: 
          { lexeme=yytext(); return OPERADOR_MENOR_IGUAL;
          }
        case 118: break;
        case 14: 
          { lexeme=yytext(); return OPERADOR_OR;
          }
        case 119: break;
        case 34: 
          { lexeme=yytext(); return OPERADOR_MULTIPLICACION_ASIGNACION;
          }
        case 120: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
