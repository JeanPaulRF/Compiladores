/* The following code was generated by JFlex 1.4.3 on 11/3/22, 8:02 PM */

package codigo;
import java.io.*;
import static codigo.Tokens.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/3/22, 8:02 PM from the specification file
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
    "\1\1\1\0\1\10\1\15\1\31\1\14\1\17\1\24\1\25\1\36"+
    "\1\26\1\1\1\35\1\16\1\21\1\20\1\13\1\33\1\1\1\23"+
    "\1\27\1\12\1\11\1\34\1\37\1\22\1\32\1\30\1\65\1\52"+
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
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\17\2"+
    "\1\7\1\10\1\3\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\3\1\1\36\2\0\1\5\3\2\1\37\12\2\1\40"+
    "\11\2\1\4\1\41\1\42\1\43\1\44\1\45\1\36"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65"+
    "\1\66\2\0\1\67\1\70\1\0\1\71\1\0\1\72"+
    "\15\2\1\73\1\2\1\74\14\2\2\75\1\76\1\77"+
    "\1\70\3\0\1\100\6\2\1\101\1\102\12\2\1\103"+
    "\2\2\1\104\1\2\1\105\1\2\1\0\1\106\3\2"+
    "\1\107\5\2\1\110\2\2\1\111\1\2\1\112\1\0"+
    "\1\2\1\113\1\2\1\114\1\2\1\3\1\115\2\2"+
    "\1\116";

  private static int [] zzUnpackAction() {
    int [] result = new int[199];
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
    "\0\u08ac\0\u08e8\0\u0924\0\u0960\0\u0168\0\u099c\0\u09d8\0\u0a14"+
    "\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4"+
    "\0\u0c30\0\u0c6c\0\u0ca8\0\170\0\u0ce4\0\u0d20\0\u0d5c\0\u0d98"+
    "\0\u0dd4\0\u0e10\0\u0e4c\0\u0e88\0\u0ec4\0\u0f00\0\74\0\74"+
    "\0\74\0\74\0\u0f3c\0\u0f78\0\u0fb4\0\74\0\u0ff0\0\74"+
    "\0\74\0\74\0\74\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\74\0\74\0\74\0\74\0\u102c\0\u1068\0\u10a4"+
    "\0\u10e0\0\u08ac\0\u111c\0\u1158\0\u1194\0\u11d0\0\u120c\0\u1248"+
    "\0\u1284\0\u12c0\0\u12fc\0\u1338\0\u1374\0\u13b0\0\u13ec\0\u1428"+
    "\0\u1464\0\u14a0\0\170\0\u14dc\0\170\0\u1518\0\u1554\0\u1590"+
    "\0\u15cc\0\u1608\0\u1644\0\u1680\0\u16bc\0\u16f8\0\u1734\0\u1770"+
    "\0\u17ac\0\74\0\u08e8\0\74\0\74\0\74\0\u17e8\0\u1824"+
    "\0\u1860\0\170\0\u189c\0\u18d8\0\u1914\0\u1950\0\u198c\0\u19c8"+
    "\0\170\0\170\0\u1a04\0\u1a40\0\u1a7c\0\u1ab8\0\u1af4\0\u1b30"+
    "\0\u1b6c\0\u1ba8\0\u1be4\0\u1c20\0\170\0\u1c5c\0\u1c98\0\170"+
    "\0\u1cd4\0\170\0\u1d10\0\u1d4c\0\u1860\0\u1d88\0\u1dc4\0\u1e00"+
    "\0\170\0\u1e3c\0\u1e78\0\u1eb4\0\u1ef0\0\u1f2c\0\170\0\u1f68"+
    "\0\u1fa4\0\170\0\u1fe0\0\170\0\u201c\0\u2058\0\170\0\u2094"+
    "\0\170\0\u20d0\0\74\0\170\0\u210c\0\u2148\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[199];
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
    "\1\11\1\12\1\3\1\13\1\14\1\15\1\16\3\3"+
    "\1\17\1\20\1\21\1\22\1\23\1\3\1\24\2\3"+
    "\1\25\2\3\1\26\1\27\1\6\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\75\0"+
    "\4\3\3\0\30\3\3\0\1\3\31\0\1\62\2\4"+
    "\1\62\3\0\30\62\3\0\1\4\7\0\1\63\14\0"+
    "\1\64\10\0\1\5\1\0\1\5\72\0\2\6\31\0"+
    "\1\6\37\0\1\5\1\6\1\65\31\0\1\6\33\0"+
    "\4\3\3\0\1\3\1\66\26\3\3\0\1\3\31\0"+
    "\4\3\3\0\10\3\1\67\17\3\3\0\1\3\31\0"+
    "\4\3\3\0\22\3\1\70\5\3\3\0\1\3\31\0"+
    "\4\3\3\0\3\3\1\71\3\3\1\72\20\3\3\0"+
    "\1\3\31\0\4\3\3\0\13\3\1\73\14\3\3\0"+
    "\1\3\31\0\4\3\3\0\3\3\1\74\24\3\3\0"+
    "\1\3\31\0\4\3\3\0\6\3\1\75\1\3\1\76"+
    "\1\3\1\77\15\3\3\0\1\3\31\0\4\3\3\0"+
    "\7\3\1\100\20\3\3\0\1\3\31\0\4\3\3\0"+
    "\3\3\1\101\2\3\1\102\21\3\3\0\1\3\31\0"+
    "\4\3\3\0\3\3\1\66\24\3\3\0\1\3\31\0"+
    "\4\3\3\0\10\3\1\103\3\3\1\104\13\3\3\0"+
    "\1\3\31\0\4\3\3\0\2\3\1\105\13\3\1\106"+
    "\7\3\1\107\1\110\3\0\1\3\31\0\4\3\3\0"+
    "\1\111\2\3\1\112\22\3\1\113\1\3\3\0\1\3"+
    "\31\0\4\3\3\0\3\3\1\114\24\3\3\0\1\3"+
    "\31\0\4\3\3\0\26\3\1\115\1\3\3\0\1\3"+
    "\70\0\1\116\1\0\1\117\4\0\1\120\64\0\1\121"+
    "\6\0\1\122\25\0\1\62\1\4\1\123\1\62\3\0"+
    "\12\62\1\124\15\62\3\0\1\123\7\0\1\63\14\0"+
    "\1\64\47\0\1\125\2\0\1\126\71\0\1\127\1\0"+
    "\1\130\73\0\1\131\73\0\1\132\73\0\1\133\1\134"+
    "\72\0\1\135\73\0\1\136\2\0\1\137\65\0\1\140"+
    "\2\0\1\141\3\0\1\142\67\0\1\143\4\0\1\144"+
    "\66\0\1\145\24\0\71\146\1\147\2\146\1\0\1\150"+
    "\2\151\1\150\3\0\30\150\3\0\1\151\30\0\73\152"+
    "\1\153\1\0\1\62\2\0\1\62\3\0\30\62\77\0"+
    "\1\154\32\0\2\155\37\0\1\155\31\0\4\3\3\0"+
    "\2\3\1\156\25\3\3\0\1\3\31\0\4\3\3\0"+
    "\16\3\1\157\1\160\10\3\3\0\1\3\31\0\4\3"+
    "\3\0\23\3\1\161\4\3\3\0\1\3\31\0\4\3"+
    "\3\0\1\3\1\162\26\3\3\0\1\3\31\0\4\3"+
    "\3\0\14\3\1\163\13\3\3\0\1\3\31\0\4\3"+
    "\3\0\7\3\1\164\20\3\3\0\1\3\31\0\4\3"+
    "\3\0\10\3\1\165\17\3\3\0\1\3\31\0\4\3"+
    "\3\0\17\3\1\166\10\3\3\0\1\3\31\0\4\3"+
    "\3\0\1\3\1\167\26\3\3\0\1\3\31\0\4\3"+
    "\3\0\2\3\1\170\25\3\3\0\1\3\31\0\4\3"+
    "\3\0\2\3\1\171\12\3\1\172\12\3\3\0\1\3"+
    "\31\0\4\3\3\0\13\3\1\173\14\3\3\0\1\3"+
    "\31\0\4\3\3\0\3\3\1\174\24\3\3\0\1\3"+
    "\31\0\4\3\3\0\2\3\1\175\25\3\3\0\1\3"+
    "\31\0\4\3\3\0\1\176\12\3\1\177\14\3\3\0"+
    "\1\3\31\0\4\3\3\0\15\3\1\200\2\3\1\201"+
    "\7\3\3\0\1\3\31\0\4\3\3\0\3\3\1\202"+
    "\24\3\3\0\1\3\31\0\4\3\3\0\16\3\1\203"+
    "\11\3\3\0\1\3\31\0\4\3\3\0\17\3\1\204"+
    "\10\3\3\0\1\3\31\0\4\3\3\0\10\3\1\205"+
    "\17\3\3\0\1\3\31\0\4\3\3\0\1\206\27\3"+
    "\3\0\1\3\31\0\4\3\3\0\6\3\1\207\7\3"+
    "\1\210\11\3\3\0\1\3\31\0\4\3\3\0\16\3"+
    "\1\211\11\3\3\0\1\3\30\0\41\116\1\0\32\116"+
    "\1\0\1\62\1\4\1\123\1\62\3\0\30\62\3\0"+
    "\1\123\7\0\1\63\14\0\1\64\4\0\1\62\2\212"+
    "\1\213\3\0\1\213\3\62\2\213\1\62\1\213\4\62"+
    "\1\213\4\62\1\213\6\62\3\0\1\212\77\0\1\214"+
    "\73\0\1\215\115\0\1\216\73\0\1\146\3\0\1\150"+
    "\2\0\1\150\3\0\30\150\36\0\2\151\37\0\1\151"+
    "\123\0\1\152\2\0\2\217\37\0\1\217\15\0\1\220"+
    "\14\0\2\155\37\0\1\155\24\0\1\221\4\0\4\3"+
    "\3\0\3\3\1\222\24\3\3\0\1\3\31\0\4\3"+
    "\3\0\3\3\1\223\24\3\3\0\1\3\31\0\4\3"+
    "\3\0\16\3\1\224\11\3\3\0\1\3\31\0\4\3"+
    "\3\0\7\3\1\225\20\3\3\0\1\3\31\0\4\3"+
    "\3\0\5\3\1\226\22\3\3\0\1\3\31\0\4\3"+
    "\3\0\1\227\27\3\3\0\1\3\31\0\4\3\3\0"+
    "\1\230\27\3\3\0\1\3\31\0\4\3\3\0\15\3"+
    "\1\231\12\3\3\0\1\3\31\0\4\3\3\0\7\3"+
    "\1\232\20\3\3\0\1\3\31\0\4\3\3\0\11\3"+
    "\1\222\16\3\3\0\1\3\31\0\4\3\3\0\7\3"+
    "\1\233\20\3\3\0\1\3\31\0\4\3\3\0\1\3"+
    "\1\234\26\3\3\0\1\3\31\0\4\3\3\0\16\3"+
    "\1\235\11\3\3\0\1\3\31\0\4\3\3\0\1\236"+
    "\27\3\3\0\1\3\31\0\4\3\3\0\2\3\1\237"+
    "\25\3\3\0\1\3\31\0\4\3\3\0\1\3\1\240"+
    "\26\3\3\0\1\3\31\0\4\3\3\0\10\3\1\241"+
    "\17\3\3\0\1\3\31\0\4\3\3\0\7\3\1\242"+
    "\20\3\3\0\1\3\31\0\4\3\3\0\13\3\1\243"+
    "\14\3\3\0\1\3\31\0\4\3\3\0\2\3\1\244"+
    "\25\3\3\0\1\3\31\0\4\3\3\0\7\3\1\245"+
    "\20\3\3\0\1\3\31\0\4\3\3\0\2\3\1\246"+
    "\14\3\1\247\10\3\3\0\1\3\31\0\4\3\3\0"+
    "\13\3\1\250\14\3\3\0\1\3\31\0\4\3\3\0"+
    "\1\251\27\3\3\0\1\3\31\0\4\3\3\0\4\3"+
    "\1\252\23\3\3\0\1\3\31\0\4\3\3\0\6\3"+
    "\1\253\21\3\3\0\1\3\32\0\2\217\37\0\1\217"+
    "\7\0\1\63\73\0\1\254\22\0\2\255\37\0\1\255"+
    "\31\0\4\3\3\0\10\3\1\222\17\3\3\0\1\3"+
    "\31\0\4\3\3\0\15\3\1\200\12\3\3\0\1\3"+
    "\31\0\4\3\3\0\4\3\1\256\23\3\3\0\1\3"+
    "\31\0\4\3\3\0\6\3\1\257\21\3\3\0\1\3"+
    "\31\0\4\3\3\0\1\3\1\260\26\3\3\0\1\3"+
    "\31\0\4\3\3\0\25\3\1\261\2\3\3\0\1\3"+
    "\31\0\4\3\3\0\13\3\1\223\14\3\3\0\1\3"+
    "\31\0\4\3\3\0\13\3\1\262\14\3\3\0\1\3"+
    "\31\0\4\3\3\0\17\3\1\263\10\3\3\0\1\3"+
    "\31\0\4\3\3\0\2\3\1\222\25\3\3\0\1\3"+
    "\31\0\4\3\3\0\16\3\1\264\11\3\3\0\1\3"+
    "\31\0\4\3\3\0\21\3\1\236\6\3\3\0\1\3"+
    "\31\0\4\3\3\0\7\3\1\265\20\3\3\0\1\3"+
    "\31\0\4\3\3\0\3\3\1\266\24\3\3\0\1\3"+
    "\31\0\4\3\3\0\2\3\1\267\25\3\3\0\1\3"+
    "\31\0\4\3\3\0\21\3\1\270\6\3\3\0\1\3"+
    "\31\0\4\3\3\0\16\3\1\271\11\3\3\0\1\3"+
    "\31\0\4\3\3\0\2\3\1\272\25\3\3\0\1\3"+
    "\31\0\4\3\3\0\2\3\1\273\25\3\3\0\1\3"+
    "\31\0\4\3\3\0\7\3\1\274\20\3\3\0\1\3"+
    "\32\0\2\275\37\0\1\275\31\0\4\3\3\0\7\3"+
    "\1\266\20\3\3\0\1\3\31\0\4\3\3\0\7\3"+
    "\1\222\20\3\3\0\1\3\31\0\4\3\3\0\6\3"+
    "\1\276\21\3\3\0\1\3\31\0\4\3\3\0\10\3"+
    "\1\277\17\3\3\0\1\3\31\0\4\3\3\0\2\3"+
    "\1\300\25\3\3\0\1\3\31\0\4\3\3\0\21\3"+
    "\1\222\6\3\3\0\1\3\31\0\4\3\3\0\4\3"+
    "\1\222\23\3\3\0\1\3\31\0\4\3\3\0\14\3"+
    "\1\222\13\3\3\0\1\3\31\0\4\3\3\0\26\3"+
    "\1\301\1\3\3\0\1\3\31\0\4\3\3\0\10\3"+
    "\1\302\17\3\3\0\1\3\31\0\4\3\3\0\16\3"+
    "\1\226\11\3\3\0\1\3\32\0\2\275\37\0\1\275"+
    "\16\0\1\303\12\0\4\3\3\0\2\3\1\304\25\3"+
    "\3\0\1\3\31\0\4\3\3\0\7\3\1\305\20\3"+
    "\3\0\1\3\31\0\4\3\3\0\1\3\1\306\26\3"+
    "\3\0\1\3\31\0\4\3\3\0\13\3\1\222\14\3"+
    "\3\0\1\3\31\0\4\3\3\0\7\3\1\307\20\3"+
    "\3\0\1\3\30\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8580];
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
    "\1\0\1\11\41\1\13\11\4\1\2\0\32\1\4\11"+
    "\3\1\1\11\1\1\16\11\2\0\2\1\1\0\1\1"+
    "\1\0\35\1\1\11\1\1\3\11\3\0\32\1\1\0"+
    "\20\1\1\0\5\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[199];
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
        case 74: 
          { lexeme=yytext(); return While;
          }
        case 79: break;
        case 70: 
          { lexeme=yytext(); return Error_Numerico;
          }
        case 80: break;
        case 73: 
          { lexeme=yytext(); return Const;
          }
        case 81: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 82: break;
        case 36: 
          { lexeme=yytext(); return Operador_Multiplicacion_Asignacion;
          }
        case 83: break;
        case 17: 
          { lexeme=yytext(); return Operador_Suma;
          }
        case 84: break;
        case 11: 
          { lexeme=yytext(); return Operador_Modulo;
          }
        case 85: break;
        case 29: 
          { lexeme=yytext(); return Operador_Punto;
          }
        case 86: break;
        case 15: 
          { lexeme=yytext(); return Operador_Or;
          }
        case 87: break;
        case 71: 
          { lexeme=yytext(); return Break;
          }
        case 88: break;
        case 3: 
          { lexeme=yytext(); return Literal_Entero;
          }
        case 89: break;
        case 66: 
          { lexeme=yytext(); return Else;
          }
        case 90: break;
        case 12: 
          { lexeme=yytext(); return Operador_Asignacion;
          }
        case 91: break;
        case 45: 
          { lexeme=yytext(); return Operador_And_Logico;
          }
        case 92: break;
        case 51: 
          { lexeme=yytext(); return Operador_Decremento;
          }
        case 93: break;
        case 25: 
          { lexeme=yytext(); return Operador_Parentesis_Cuadrado_Derecho;
          }
        case 94: break;
        case 28: 
          { lexeme=yytext(); return Operador_Ternario_Puntos;
          }
        case 95: break;
        case 67: 
          { lexeme=yytext(); return Case;
          }
        case 96: break;
        case 13: 
          { lexeme=yytext(); return Operador_And;
          }
        case 97: break;
        case 57: 
          { lexeme=yytext(); return Literal_CADENA;
          }
        case 98: break;
        case 8: 
          { lexeme=yytext(); return Operador_Multiplicacion;
          }
        case 99: break;
        case 58: 
          { lexeme=yytext(); return Literal_Float;
          }
        case 100: break;
        case 34: 
          { lexeme=yytext(); return Operador_Division_Asignacion;
          }
        case 101: break;
        case 18: 
          { lexeme=yytext(); return Operador_Not_Logico;
          }
        case 102: break;
        case 10: 
          { lexeme=yytext(); return Operador_Menor;
          }
        case 103: break;
        case 9: 
          { lexeme=yytext(); return Operador_Mayor;
          }
        case 104: break;
        case 24: 
          { lexeme=yytext(); return Operador_Parentesis_Cuadrado_Izquierdo;
          }
        case 105: break;
        case 1: 
          { lexeme=yytext(); return Error_Token;
          }
        case 106: break;
        case 31: 
          { lexeme=yytext(); return Do;
          }
        case 107: break;
        case 42: 
          { lexeme=yytext(); return Operador_Modulo_Asignacion;
          }
        case 108: break;
        case 20: 
          { lexeme=yytext(); return Operador_Puntoycoma;
          }
        case 109: break;
        case 61: 
          { lexeme=yytext(); return Literal_Hexadecimal;
          }
        case 110: break;
        case 44: 
          { lexeme=yytext(); return Operador_And_Asignacion;
          }
        case 111: break;
        case 69: 
          { lexeme=yytext(); return Void;
          }
        case 112: break;
        case 60: 
          { lexeme=yytext(); return Int;
          }
        case 113: break;
        case 47: 
          { lexeme=yytext(); return Operador_Or_Asignacion;
          }
        case 114: break;
        case 62: 
          { lexeme=yytext(); return Operador_Desplazamiento_Derecha_Asignacion;
          }
        case 115: break;
        case 49: 
          { lexeme=yytext(); return Operador_Miembro_Puntero;
          }
        case 116: break;
        case 14: 
          { lexeme=yytext(); return Operador_Xor;
          }
        case 117: break;
        case 30: 
          { lexeme=yytext(); return Error_Alfanumerico;
          }
        case 118: break;
        case 52: 
          { lexeme=yytext(); return Operador_Suma_Asignacion;
          }
        case 119: break;
        case 27: 
          { lexeme=yytext(); return Operador_Corchete_Derecho;
          }
        case 120: break;
        case 50: 
          { lexeme=yytext(); return Operador_Resta_Asignacion;
          }
        case 121: break;
        case 33: 
          { lexeme=yytext(); return Comentario_Inicio;
          }
        case 122: break;
        case 75: 
          { lexeme=yytext(); return Return;
          }
        case 123: break;
        case 4: 
          { /*Ignore*/;
          }
        case 124: break;
        case 59: 
          { lexeme=yytext(); return For;
          }
        case 125: break;
        case 41: 
          { lexeme=yytext(); return Operador_Menor_Igual;
          }
        case 126: break;
        case 40: 
          { lexeme=yytext(); return Operador_Desplazamiento_Izquierda;
          }
        case 127: break;
        case 65: 
          { lexeme=yytext(); return Long;
          }
        case 128: break;
        case 32: 
          { lexeme=yytext(); return If;
          }
        case 129: break;
        case 78: 
          { lexeme=yytext(); return Continue;
          }
        case 130: break;
        case 21: 
          { lexeme=yytext(); return Operador_Ternacio_Pregunta;
          }
        case 131: break;
        case 64: 
          { lexeme=yytext(); return Palabra_Reservada;
          }
        case 132: break;
        case 37: 
          { lexeme=yytext(); return Literal_Octal;
          }
        case 133: break;
        case 77: 
          { lexeme=yytext(); return Default;
          }
        case 134: break;
        case 16: 
          { lexeme=yytext(); return Operador_Resta;
          }
        case 135: break;
        case 54: 
          { lexeme=yytext(); return Operador_Diferente;
          }
        case 136: break;
        case 22: 
          { lexeme=yytext(); return Operador_Parentesis_Izquierdo;
          }
        case 137: break;
        case 46: 
          { lexeme=yytext(); return Operador_Xor_Asignacion;
          }
        case 138: break;
        case 68: 
          { lexeme=yytext(); return Char;
          }
        case 139: break;
        case 23: 
          { lexeme=yytext(); return Operador_Parentesis_Derecho;
          }
        case 140: break;
        case 76: 
          { lexeme=yytext(); return Switch;
          }
        case 141: break;
        case 38: 
          { lexeme=yytext(); return Operador_Desplazamiento_Derecha;
          }
        case 142: break;
        case 43: 
          { lexeme=yytext(); return Operador_Igual;
          }
        case 143: break;
        case 53: 
          { lexeme=yytext(); return Operador_Incremento;
          }
        case 144: break;
        case 55: 
          { lexeme=yytext(); return Error_Literal;
          }
        case 145: break;
        case 26: 
          { lexeme=yytext(); return Operador_Corchete_Izquierdo;
          }
        case 146: break;
        case 48: 
          { lexeme=yytext(); return Operador_OR_Logico;
          }
        case 147: break;
        case 5: 
          { lexeme=yytext(); return New_Line;
          }
        case 148: break;
        case 72: 
          { lexeme=yytext(); return Short;
          }
        case 149: break;
        case 6: 
          { lexeme=yytext(); return Operador_Coma;
          }
        case 150: break;
        case 56: 
          { lexeme=yytext(); return Literal_CARACTER;
          }
        case 151: break;
        case 19: 
          { lexeme=yytext(); return Operador_Not;
          }
        case 152: break;
        case 63: 
          { lexeme=yytext(); return Operador_Desplazamiento_Izquierda_Asignacion;
          }
        case 153: break;
        case 7: 
          { lexeme=yytext(); return Operador_Division;
          }
        case 154: break;
        case 39: 
          { lexeme=yytext(); return Operador_Mayor_Igual;
          }
        case 155: break;
        case 35: 
          { lexeme=yytext(); return Comentario_Fin;
          }
        case 156: break;
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
