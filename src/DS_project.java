i m p o r t   j a v a x . s w i n g . * ;  
 i m p o r t   j a v a . a w t . * ;  
 i m p o r t   j a v a . a w t . e v e n t . A c t i o n E v e n t ;  
 i m p o r t   j a v a . a w t . e v e n t . A c t i o n L i s t e n e r ;  
 i m p o r t   j a v a . a w t . e v e n t . M o u s e A d a p t e r ;  
 i m p o r t   j a v a . a w t . e v e n t . M o u s e E v e n t ;  
 i m p o r t   j a v a . a w t . e v e n t . W i n d o w A d a p t e r ;  
 i m p o r t   j a v a . a w t . e v e n t . W i n d o w E v e n t ;  
 i m p o r t   j a v a . a w t . e v e n t . W i n d o w L i s t e n e r ;  
 i m p o r t   j a v a x . s w i n g . J L a b e l ;  
 i m p o r t   j a v a x . s w i n g . J C o l o r C h o o s e r ;  
 i m p o r t   j a v a x . s w i n g . c o l o r c h o o s e r . C o l o r S e l e c t i o n M o d e l ;  
 i m p o r t   j a v a x . s w i n g . e v e n t . C h a n g e L i s t e n e r ;  
 i m p o r t   j a v a x . s w i n g . e v e n t . C h a n g e E v e n t ;  
  
 / / f o r   f i n a l   p r e s e n t a t i o n  
 p u b l i c   c l a s s   D S _ p r o j e c t   e x t e n d s   J F r a m e   {  
 	 R e c t P a n e l   r e c t P a n e l ;  
 	  
         p u b l i c   D S _ p r o j e c t ( )   {  
                  
                 s e t T i t l e ( " D r a w i n g   B o a r d " ) ;  
                 s e t D e f a u l t C l o s e O p e r a t i o n ( J F r a m e . E X I T _ O N _ C L O S E ) ;  
                 c r e a t e M e n u ( ) ;  
                 r e c t P a n e l   =   n e w   R e c t P a n e l ( ) ;  
                 a d d ( r e c t P a n e l ,   B o r d e r L a y o u t . N O R T H ) ; / / ��0��  R e c t P a n e l �� � 
                 p a c k ( ) ;  
                 s e t S i z e ( 1 0 0 0 , 7 0 0 ) ;  
                 s e t V i s i b l e ( t r u e ) ;  
         }  
          
         p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
         	 n e w   D S _ p r o j e c t ( ) ;  
  
         }  
          
   / /   D S _ p r o j e c t X�  i n n e r   c l a s s  
         c l a s s   M e n u A c t i o n L i s t e n e r   i m p l e m e n t s   A c t i o n L i s t e n e r   {    
         	 p u b l i c   v o i d   a c t i o n P e r f o r m e d ( A c t i o n E v e n t   e )   {  
         	 	 S t r i n g   c m d   =   e . g e t A c t i o n C o m m a n d ( ) ;  
         	 	 S y s t e m . o u t . p r i n t l n ( " )��  tЭ�\�  T�t�:   " + c m d + " ,   " + e . g e t S o u r c e ( ) ) ;  
         	 	 s w i t c h ( c m d )   {   / /   T�t�  D�t�\�X�  ��X�  l��� 
         	 	  
 	 	 	 c a s e   " Z o o m   i n " :  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " z o o m   i n   s h o u l d   b e   i m p l e m e n t e d " ) ; b r e a k ;  
 	 	 	 c a s e   " Z o o m   o u t " :  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " z o o m   o u t   s h o u l d   b e   i m p l e m e n t e s " ) ; b r e a k ;  
 	 	 	  
 	 	 	 	 / / F i l e   m e n u   c h i l d r e n  
 	 	 	 c a s e   " S a v e "   :  
 	 	 	 	 i f ( r e c t P a n e l ! = n u l l )   {  
 	 	 	 	 	 S a v e L   s a v e P a n n   =   n e w   S a v e L ( r e c t P a n e l ,   r e c t P a n e l . b u f f e r e d I m a g e ) ;  
 	 	 	 	 	 s a v e P a n n . s a v e P i c ( ) ;  
 	 	 	 	 } b r e a k ;  
 	 	 	 c a s e   " O p e n "   :  
 	 	 	 	 i f ( r e c t P a n e l ! = n u l l )   {  
 	 	 	 	 	 O p e n L   o p e n P a n n   =   n e w   O p e n L ( r e c t P a n e l ,   r e c t P a n e l . b u f f e r e d I m a g e ) ;  
 	 	 	 	 	 o p e n P a n n . o p e n P i c ( ) ;  
 	 	 	 	 } b r e a k ;  
 	 	 	 c a s e   " C l e a r "   :  
 	 	 	 	 r e c t P a n e l . s h a p e S t r i n g = " ȴ��ɰ�0�" ;  
 	 	 	 	 b r e a k ;  
 	 	 	 	  
 	 	 	 	 / / S h a p e   m e n u   c h i l d r e n  
 	 	 	 c a s e   " R e c t a n g u l a r "   :  
 	 	 	 	 r e c t P a n e l . s h a p e S t r i n g = c m d ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " c o l o r   b l a c k   l o a d   c l i c k e d " ) ;  
 	 	 	 	 b r e a k ;  
 	 	 	  
 	 	 	 c a s e   " T r i a n g l e " :  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " t r i a n g l e   d r a w i n g   s h o u l d   b e   i m p l e m e n t e d " ) ;   b r e a k ;  
 	 	 	  
 	 	 	 c a s e   " L i n e " :  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " l i n e   d r a w i n g   s h o u l d   b e " ) ;   b r e a k ;  
 	 	 	  
 	 	 	 c a s e   " D r a w " :  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " d r a w   s h o u l d   b e " ) ; b r e a k ;  
 	 	 	 	  
 	 	 	 c a s e   " T e x t " :  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " T e x t   i n p u t   s h o u l d   b e   i m p l e m e n t e d " ) ;   b r e a k ;  
 	 	 	 	  
 	 	 	 c a s e   " I m a g e " :  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " i m a g e   s h o u l d   b e " ) ;   b r e a k ;  
 	 	 	 	  
 	 	 	 c a s e   " 1 / 4   p t "   :  
 	 	 	 	 r e c t P a n e l . s t r o k e = ( f l o a t ) 0 . 2 5 ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " c o l o r   s t r o k e   1 / 4   c l i c k e d " ) ;  
 	 	 	 	 b r e a k ;  
 	 	 	 	  
 	 	 	  
         	 	 }  
         	 }  
         }  
  
          
  
         v o i d   c r e a t e M e n u ( )   {  
                 J M e n u B a r   m b   =   n e w   J M e n u B a r ( ) ;  
                 M e n u A c t i o n L i s t e n e r   m e n u l i s t e n e r   =   n e w   M e n u A c t i o n L i s t e n e r ( ) ;  
                 M e n u A c t i o n L i s t e n e r   s h a p e l i s t e n e r   =   n e w   M e n u A c t i o n L i s t e n e r ( ) ;  
                 J T o o l B a r   t b   =   n e w   J T o o l B a r ( ) ;  
                 S p i n n e r N u m b e r M o d e l   f o n t S i z e   =   n e w   S p i n n e r N u m b e r M o d e l ( 8 ,   1 ,   5 0 ,   1 ) ;  
                 S p i n n e r N u m b e r M o d e l   l i n e T h i c k n e s s   =   n e w   S p i n n e r N u m b e r M o d e l ( 8 ,   1 ,   5 0 ,   1 ) ;  
                 J S p i n n e r   f o n t S p i n n e r   =   n e w   J S p i n n e r ( f o n t S i z e ) ;  
                 J S p i n n e r   l i n e S p i n n e r   =   n e w   J S p i n n e r ( l i n e T h i c k n e s s ) ;  
                 J C o m b o B o x   c o m b o   =   n e w   J C o m b o B o x < > ( ) ;  
                  
  
                 a d d ( t b ) ;  
                 s e t J M e n u B a r ( m b ) ;  
                 t b . s e t L o c a t i o n ( 0 ,   0 ) ;  
                 t b . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 1 0 0 0 , 6 0 ) ) ;  
  
                 m b . s e t B a c k g r o u n d ( C o l o r . p i n k ) ;  
                 t b . s e t B a c k g r o u n d ( C o l o r . w h i t e ) ;  
                 t b . s e t L a y o u t ( n e w   F l o w L a y o u t ( ) ) ;  
                  
                 J M e n u [ ]   m e n u s   =   n e w   J M e n u [ 5 ] ;  
                 S t r i n g [ ]   m e n u n a m e s   =   { " F i l e " ,   " S h a p e " ,   " Z o o m   i n " ,   " Z o o m   o u t " ,   " P o l y g o n " } ;  
                  
                 f o r ( i n t   i = 0 ;   i < m e n u s . l e n g t h ;   i + + )   {  
                 	 m e n u s [ i ]   =   n e w   J M e n u ( m e n u n a m e s [ i ] ) ;  
                 	  
                 	 i f ( i = = m e n u s . l e n g t h - 1 )   {  
                 	 	 / / S h a p e   H���  P o l y g o n   T�t�  �� �( ��0���  R e c t a n g u l a r ,   T r i a n g l e   ��@�)  
                 	 	 m e n u s [ 1 ] . a d d ( m e n u s [ i ] ) ;  
                 	 	 m e n u s [ 1 ] . a d d S e p a r a t o r ( ) ;  
                 	 	 b r e a k ;  
                 	 }  
                 	 m b . a d d ( m e n u s [ i ] ) ;  
                 }  
                  
                 / / T�t�ļ  ��|�  �t��   ȥ� 
                 J M e n u I t e m [ ]   m e n u c h i l d r e n   =   n e w   J M e n u I t e m [ 9 ] ;  
                 S t r i n g [ ]   c h i l d m e n u n a m e s   =   { " S a v e " ,   " O p e n " ,   " C l e a r " ,   " L i n e " ,   " D r a w " ,   " T e x t " ,   " I m a g e " ,   " R e c t a n g u l a r " ,   " T r i a n g l e " } ;  
                  
                 f o r ( i n t   i = 0 ;   i < m e n u c h i l d r e n . l e n g t h ;   i + + )   {  
                 	 m e n u c h i l d r e n [ i ]   =   n e w   J M e n u I t e m ( c h i l d m e n u n a m e s [ i ] ) ;  
                 	 i f ( i < 3 )   {  
                 	 	 / / f i l e m e n u ��  s a v e ,   o p e n ,   c l e a r   T�t�  �� � 
                 	 	 m e n u s [ 0 ] . a d d ( m e n u c h i l d r e n [ i ] ) ;  
                 	 	 m e n u s [ 0 ] . a d d S e p a r a t o r ( ) ;  
                 	 } e l s e   i f ( i > = 3   & &   i < 7 )   {  
                 	 	 / / S h a p e   m e n u ��  d r a w ,   t e x t ,   l i n e ,   i m a g e   T�t�  �� � 
                 	 	 m e n u s [ 1 ] . a d d ( m e n u c h i l d r e n [ i ] ) ;  
                 	 	 m e n u s [ 1 ] . a d d S e p a r a t o r ( ) ;  
                 	 } e l s e   {  
                 	 	 / / P o l y g o n   m e n u ��   
                 	 	 m e n u s [ 4 ] . a d d ( m e n u c h i l d r e n [ i ] ) ;  
                 	 	 m e n u s [ 4 ] . a d d S e p a r a t o r ( ) ;  
                 	 }  
                 	 m e n u c h i l d r e n [ i ] . a d d A c t i o n L i s t e n e r ( m e n u l i s t e n e r ) ;  
                 }  
                  
  
                 t h i s . s e t L a y o u t ( n e w   F l o w L a y o u t ( ) ) ;  
                  
                 I m a g e I c o n [ ]   i m a g e i c o n s   =   n e w   I m a g e I c o n [ 1 8 ] ;  
                 I m a g e [ ]   i m a g e s   =   n e w   I m a g e [ 1 8 ] ;  
                  
                 S t r i n g [ ]   i m a g e n a m e s   =   { " b a c k " ,   " f r o n t " ,   " c o p y " ,   " p a s t e " ,   " l e f t r o t a t i o n " ,   " r i g h t r o t a t i o n " ,   " c o l o r " ,     " e r a s e " ,   " l i n e " ,   " b a c k 2 " ,   " f r o n t 2 " ,   " c o p y 2 " ,   " p a s t e 2 " ,   " l e f t r o t a t i o n 2 " ,   " r i g h t r o t a t i o n 2 " ,   " c o l o r 2 " ,   " e r a s e 2 " } ;  
                 f o r ( i n t   i = 0 ; i < i m a g e n a m e s . l e n g t h ; i + + )   {  
                 	 i m a g e i c o n s [ i ]   =   n e w   I m a g e I c o n ( " f o l d e r / " + i m a g e n a m e s [ i ] + " . p n g " ) ;  
                 	 i m a g e s [ i ]   =   i m a g e i c o n s [ i ] . g e t I m a g e ( ) ;  
                 	 i m a g e s [ i ]   =   i m a g e s [ i ] . g e t S c a l e d I n s t a n c e ( 4 0 ,   4 0 ,   I m a g e . S C A L E _ S M O O T H ) ;  
                 	 i m a g e i c o n s [ i ]   =   n e w   I m a g e I c o n ( i m a g e s [ i ] ) ;  
                 }  
                 J B u t t o n [ ]   b t n   =   n e w   J B u t t o n [ 9 ] ;  
                 t o o l A c t i o n L i s t e n e r   b u t t o n l i s t e n e r   =   n e w   t o o l A c t i o n L i s t e n e r ( ) ;  
                  
                 f o r   ( i n t   i   =   0 ;   i   <   b t n . l e n g t h ;   i + + )   {  
                     b t n [ i ]   =   n e w   J B u t t o n ( i m a g e i c o n s [ i ] ) ;  
                     t b . a d d ( b t n [ i ] ) ;  
                     b t n [ i ] . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 3 8 ,   3 8 ) ) ;  
                     i f ( i = = 8 ) b r e a k ;  
                     b t n [ i ] . s e t R o l l o v e r I c o n ( i m a g e i c o n s [ i + 9 ] ) ;  
                     b t n [ i ] . s e t B o r d e r P a i n t e d ( t r u e ) ;  
                     b t n [ i ] . s e t A c t i o n C o m m a n d ( " b u t t o n "   +   i ) ;  
                     b t n [ i ] . a d d A c t i o n L i s t e n e r ( b u t t o n l i s t e n e r ) ;  
                     t b . a d d S e p a r a t o r ( ) ;  
             }  
                  
                 t b . a d d ( l i n e S p i n n e r ) ;  
                 t b . a d d S e p a r a t o r ( ) ;  
                 J L a b e l   s i z e l a b e l   =   n e w   J L a b e l ( " T e x t   S i z e " ) ;  
                 s i z e l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 6 0 ,   4 0 ) ) ;  
                 t b . a d d ( s i z e l a b e l ) ;  
                 t b . a d d ( f o n t S p i n n e r ) ;  
                 t b . a d d S e p a r a t o r ( ) ;  
                 J L a b e l   f o n t l a b e l   =   n e w   J L a b e l ( " F o n t s " ) ;  
                 f o n t l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 4 0 , 4 0 ) ) ;  
                 c o m b o . a d d I t e m ( " ѹ@�  ��" ) ;  
                 c o m b o . a d d I t e m ( " �����" ) ;  
                 c o m b o . a d d I t e m ( " h��q����" ) ;  
                 t b . a d d ( f o n t l a b e l ) ;  
                 t b . a d d ( c o m b o ) ;  
                  
  
         }  
          
         c l a s s   t o o l A c t i o n L i s t e n e r   i m p l e m e n t s   A c t i o n L i s t e n e r   {  
         	  
         	 p u b l i c   v o i d   a c t i o n P e r f o r m e d ( A c t i o n E v e n t   e )   {  
         	 	 S t r i n g   l a b e l   =   e . g e t A c t i o n C o m m a n d ( ) ;  
         	 	  
         	 s w i t c h ( l a b e l )   {  
         	 c a s e   " b u t t o n 0 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   U n d o " ) ; b r e a k ;  
         	 c a s e   " b u t t o n 1 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   R e d o " ) ; b r e a k ;  
         	 c a s e   " b u t t o n 2 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   C o p y " ) ; b r e a k ;  
         	 c a s e   " b u t t o n 3 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   P a s t e " ) ; b r e a k ;  
         	 c a s e   " b u t t o n 4 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   L e f t r o t a i o n " ) ; b r e a k ;  
         	 c a s e   " b u t t o n 5 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   R i g h t r o t a i o n " ) ; b r e a k ;  
         	 c a s e   " b u t t o n 6 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   C o l o r " ) ;  
         	 	 c o l o r ( ) ;  
         	 	 b r e a k ;  
         	 c a s e   " b u t t o n 7 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   L i n e   t h i c k n e s s " ) ; b r e a k ;  
         	 c a s e   " b u t t o n 8 " :  
         	 	 S y s t e m . o u t . p r i n t l n ( "  ����  ����:   E r a s e " ) ; b r e a k ;  
         	 }  
         	  
         	 }  
 }  
  
  
  
 	 p u b l i c   v o i d   c o l o r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 J F r a m e   f r a m e   =   n e w   J F r a m e ( " C o l o r   p a l e t t e " ) ;  
 	 	 f r a m e . s e t D e f a u l t C l o s e O p e r a t i o n ( J F r a m e . E X I T _ O N _ C L O S E ) ;  
 	 	  
 	 	 f i n a l   J L a b e l   l a b e l   =   n e w   J L a b e l ( " a l e c t u r e . b l o g s p o t . c o m " , J L a b e l . C E N T E R ) ;  
 	 	 l a b e l . s e t F o n t ( n e w   F o n t ( " D I A L O G " ,   F o n t . B O L D | F o n t . I T A L I C , 3 6 ) ) ;  
 	 	 f r a m e . a d d ( l a b e l ,   B o r d e r L a y o u t . S O U T H ) ;   / / �t��D�    ����  DŘ�����  0�X� 
  
  
 	 	 f i n a l   J C o l o r C h o o s e r   c h o o s e r   =   n e w   J C o l o r C h o o s e r ( ) ;   / / |�|�  ����  ���� �D� 
 	 	 C o l o r S e l e c t i o n M o d e l   m o d e l   =   c h o o s e r . g e t S e l e c t i o n M o d e l ( ) ;  
 	 	  
 	 	 C h a n g e L i s t e n e r   l i s t e n e r   =   n e w   C h a n g e L i s t e n e r ( ) {   / / ����  tИ���  �� 
 	 	 	 p u b l i c   v o i d   s t a t e C h a n g e d ( C h a n g e E v e n t   e )  
 	 	 	 {  
 	 	 	 	 C o l o r   n e w F o r e g r o u n d C o l o r   =   c h o o s e r . g e t C o l o r ( ) ; / /  ���\�  |�|��D�  ��4� 
 	 	 	 	 i n t   r e d d   =   n e w F o r e g r o u n d C o l o r . g e t R e d ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "  ���\�  ���X�  R   :   " , r e d d ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( " \ n " ) ;  
 	 	 	 	  
 	 	 	 	 i n t   g r e e n n   =   n e w F o r e g r o u n d C o l o r . g e t G r e e n ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "  ���\�  ���X�  G   : " , g r e e n n ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( " \ n " ) ;  
 	 	 	 	  
 	 	 	 	 i n t   b l u e e   =   n e w F o r e g r o u n d C o l o r . g e t B l u e ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "  ���\�  ���X�  B   :   " , b l u e e ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( " \ n " ) ;  
 	 	 	 	 l a b e l . s e t F o r e g r o u n d ( n e w F o r e g r o u n d C o l o r ) ;   / /   �X�  �D�  Ƚ���<�\�  ���� 
 	 	 	 }  
 	 	 } ;  
 	 	 	  
 	 m o d e l . a d d C h a n g e L i s t e n e r ( l i s t e n e r ) ;   / /  � �X�  |�|�   ���D�  0�䲼� 
 	 f r a m e . a d d ( c h o o s e r ) ;   / /   ������  |�|�  ����  $�X�X�0� 
 	 f r a m e . a d d ( c h o o s e r ) ;  
 	 f r a m e . p a c k ( ) ;  
 	 f r a m e . s e t V i s i b l e ( t r u e ) ;  
 	  
 }   }  
  
 	 	  
 	  
 / / 	 c l a s s   c o l o r  
 / / 	 {  
 / / 	 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g s [ ] )  
 / / 	 	 {  
 / / 	 	 	 J F r a m e   f r a m e   =   n e w   J F r a m e ( " C o l o r   p a l e t t e " ) ;  
 / / 	 	 	 f r a m e . s e t D e f a u l t C l o s e O p e r a t i o n ( J F r a m e . E X I T _ O N _ C L O S E ) ;  
 / / 	 	 	  
 / / 	 	 	 f i n a l   J L a b e l   l a b e l   =   n e w   J L a b e l ( " a l e c t u r e . b l o g s p o t . c o m " , J L a b e l . C E N T E R ) ;  
 / / 	 	 	 l a b e l . s e t F o n t ( n e w   F o n t ( " D I A L O G " ,   F o n t . B O L D | F o n t . I T A L I C , 3 6 ) ) ;  
 / / 	 	 	 f r a m e . a d d ( l a b e l ,   B o r d e r L a y o u t . S O U T H ) ;   / / �t��D�    ����  DŘ�����  0�X� 
 / / 	  
 / / 	  
 / / 	 	 	 f i n a l   J C o l o r C h o o s e r   c h o o s e r   =   n e w   J C o l o r C h o o s e r ( ) ;   / / |�|�  ����  ���� �D� 
 / / 	 	 	 C o l o r S e l e c t i o n M o d e l   m o d e l   =   c h o o s e r . g e t S e l e c t i o n M o d e l ( ) ;  
 / / 	 	 	  
 / / 	 	 	 C h a n g e L i s t e n e r   l i s t e n e r   =   n e w   C h a n g e L i s t e n e r ( ) {   / / ����  tИ���  �� 
 / / 	 	 	 	 p u b l i c   v o i d   s t a t e C h a n g e d ( C h a n g e E v e n t   e )  
 / / 	 	 	 	 {  
 / / 	 	 	 	 	 C o l o r   n e w F o r e g r o u n d C o l o r   =   c h o o s e r . g e t C o l o r ( ) ;   / /  ���\�  |�|��D�  ��4� 
 / / 	 	 	 	 	 l a b e l . s e t F o r e g r o u n d ( n e w F o r e g r o u n d C o l o r ) ;   / /   �X�  �D�  Ƚ���<�\�  ���� 
 / / 	 	 	 	 }  
 / / 	 	 	 } ;   / /   ����tИ���  ]� 
 / / 	  
 / / 	 	 	  
 / / 	 	 	 m o d e l . a d d C h a n g e L i s t e n e r ( l i s t e n e r ) ;   / /  � �X�  |�|�   ���D�  0�䲼� 
 / / 	 	 	 f r a m e . a d d ( c h o o s e r ) ;   / /   ������  |�|�  ����  $�X�X�0� 
 / / 	 	 	 f r a m e . a d d ( c h o o s e r ) ;  
 / / 	 	 	 f r a m e . p a c k ( ) ;  
 / / 	 	 	 f r a m e . s e t V i s i b l e ( t r u e ) ;  
 / / 	 	 } }  
 / / 	 }  
 	  
 	          
 	        
 	          
 