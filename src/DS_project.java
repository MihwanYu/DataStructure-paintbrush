i m p o r t   j a v a x . s w i n g . * ;  
  
  
 i m p o r t   j a v a . a w t . * ;  
 i m p o r t   j a v a . a w t . e v e n t . A c t i o n E v e n t ;  
 i m p o r t   j a v a . a w t . e v e n t . A c t i o n L i s t e n e r ;  
  
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
                 S p i n n e r N u m b e r M o d e l   f o n t s i z e   =   n e w   S p i n n e r N u m b e r M o d e l ( 8 ,   1 ,   5 0 ,   1 ) ;  
                 J S p i n n e r   s p i n n e r   =   n e w   J S p i n n e r ( f o n t s i z e ) ;  
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
                 / *  
                 J M e n u   f i l e m e n u   =   n e w   J M e n u ( " F i l e " ) ;  
                 J M e n u   s h a p e m e n u   =   n e w   J M e n u ( " S h a p e " ) ;  
                 J M e n u   z o o m i n m e n u   =   n e w   J M e n u ( " Z o o m   i n " ) ;  
                 J M e n u   z o o m o u t m e n u   =   n e w   J M e n u ( " Z o o m   o u t " ) ;  
  
                 m b . a d d ( f i l e m e n u ) ;  
                 m b . a d d ( s h a p e m e n u ) ;  
                 m b . a d d ( z o o m i n m e n u ) ;  
                 m b . a d d ( z o o m o u t m e n u ) ;  
 	 	 * /  
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
                 / *  
                 J M e n u I t e m   s a v e m e n u   =   n e w   J M e n u I t e m ( " S a v e " ) ;  
                 J M e n u I t e m   o p e n m e n u   =   n e w   J M e n u I t e m ( " O p e n " ) ;  
                 J M e n u I t e m   c l e a r m e n u   =   n e w   J M e n u I t e m ( " C l e a r " ) ;  
  
                 s a v e m e n u . a d d A c t i o n L i s t e n e r ( m e n u l i s t e n e r ) ;  
                 o p e n m e n u . a d d A c t i o n L i s t e n e r ( m e n u l i s t e n e r ) ;  
                 c l e a r m e n u . a d d A c t i o n L i s t e n e r ( m e n u l i s t e n e r ) ;  
  
                 J M e n u   s h a p e 2 m e n u   =   n e w   J M e n u ( " S h a p e " ) ;  
                 J M e n u I t e m   d r a w m e n u   =   n e w   J M e n u I t e m ( " D r a w " ) ;  
                 J M e n u I t e m   t e x t m e n u   =   n e w   J M e n u I t e m ( " T e x t " ) ;  
                 J M e n u I t e m   l i n e m e n u   =   n e w   J M e n u I t e m ( " L i n e " ) ;  
                 J M e n u I t e m   i m a g e m e n u   =   n e w   J M e n u I t e m ( " I m a g e " ) ;  
  
                 J M e n u I t e m   r e c t a n g u l a r   =   n e w   J M e n u I t e m ( " R e c t a n g l u a r " ) ;  
                 J M e n u I t e m   t r i a n g l e   =   n e w   J M e n u I t e m ( " T r i a n g l e " ) ;  
                 r e c t a n g u l a r . a d d A c t i o n L i s t e n e r ( m e n u l i s t e n e r ) ;  
  
                 s h a p e m e n u . a d d ( s h a p e 2 m e n u ) ;  
                 s h a p e m e n u . a d d ( l i n e m e n u ) ;  
                 s h a p e m e n u . a d d ( d r a w m e n u ) ;  
                 s h a p e m e n u . a d d ( t e x t m e n u ) ;  
                 s h a p e m e n u . a d d ( i m a g e m e n u ) ;  
  
                 f i l e m e n u . a d d ( s a v e m e n u ) ;  
                 f i l e m e n u . a d d S e p a r a t o r ( ) ;  
                 f i l e m e n u . a d d ( o p e n m e n u ) ;  
                 f i l e m e n u . a d d S e p a r a t o r ( ) ;  
                 f i l e m e n u . a d d ( c l e a r m e n u ) ;  
  
                 s h a p e 2 m e n u . a d d ( r e c t a n g u l a r ) ;  
                 s h a p e 2 m e n u . a d d ( t r i a n g l e ) ;  
 	 	 * /  
  
                 t h i s . s e t L a y o u t ( n e w   F l o w L a y o u t ( ) ) ;  
                  
                 I m a g e I c o n [ ]   i m a g e i c o n s   =   n e w   I m a g e I c o n [ 1 8 ] ;  
                 I m a g e [ ]   i m a g e s   =   n e w   I m a g e [ 1 8 ] ;  
                  
                 S t r i n g [ ]   i m a g e n a m e s   =   { " b a c k " ,   " f r o n t " ,   " c o p y " ,   " p a s t e " ,   " l e f t r o t a t i o n " ,   " r i g h t r o t a t i o n " ,   " c o l o r " ,   " l i n e " ,   " e r a s e " ,   " b a c k 2 " ,   " f r o n t 2 " ,   " c o p y 2 " ,   " p a s t e 2 " ,   " l e f t r o t a t i o n 2 " ,   " r i g h t r o t a t i o n 2 " ,   " c o l o r 2 " ,   " l i n e 2 " ,   " e r a s e 2 " } ;  
                 f o r ( i n t   i = 0 ; i < i m a g e n a m e s . l e n g t h ; i + + )   {  
                 	 i m a g e i c o n s [ i ]   =   n e w   I m a g e I c o n ( " f o l d e r / " + i m a g e n a m e s [ i ] + " . p n g " ) ;  
                 	 i m a g e s [ i ]   =   i m a g e i c o n s [ i ] . g e t I m a g e ( ) ;  
                 	 i m a g e s [ i ]   =   i m a g e s [ i ] . g e t S c a l e d I n s t a n c e ( 4 0 ,   4 0 ,   I m a g e . S C A L E _ S M O O T H ) ;  
                 	 i m a g e i c o n s [ i ]   =   n e w   I m a g e I c o n ( i m a g e s [ i ] ) ;  
                 }  
                 J B u t t o n [ ]   b t n   =   n e w   J B u t t o n [ 9 ] ;  
                  
                 f o r   ( i n t   i   =   0 ;   i   <   b t n . l e n g t h ;   i + + )   {  
                     b t n [ i ]   =   n e w   J B u t t o n ( i m a g e i c o n s [ i ] ) ;  
                     t b . a d d ( b t n [ i ] ) ;  
                     b t n [ i ] . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 4 0 ,   4 0 ) ) ;  
                     b t n [ i ] . s e t R o l l o v e r I c o n ( i m a g e i c o n s [ i + 9 ] ) ;  
                     b t n [ i ] . s e t B o r d e r P a i n t e d ( t r u e ) ;  
                     t b . a d d S e p a r a t o r ( ) ;  
             }  
                 t b . a d d S e p a r a t o r ( ) ;  
                 J L a b e l   s i z e l a b e l   =   n e w   J L a b e l ( " T e x t   S i z e " ) ;  
                 s i z e l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 6 0 ,   4 0 ) ) ;  
                 t b . a d d ( s i z e l a b e l ) ;  
                 t b . a d d ( s p i n n e r ) ;  
                 t b . a d d S e p a r a t o r ( ) ;  
                 J L a b e l   f o n t l a b e l   =   n e w   J L a b e l ( " F o n t s " ) ;  
                 f o n t l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 4 0 , 4 0 ) ) ;  
                 c o m b o . a d d I t e m ( " ѹ@�  ��" ) ;  
                 c o m b o . a d d I t e m ( " �����" ) ;  
                 c o m b o . a d d I t e m ( " h��q����" ) ;  
                 t b . a d d ( f o n t l a b e l ) ;  
                 t b . a d d ( c o m b o ) ;  
                  
 / /                 I m a g e I c o n   b a c k   =   n e w   I m a g e I c o n ( " f o l d e r / b a c k . p n g " ) ;  
 / /                 I m a g e I c o n   b a c k 2   =   n e w   I m a g e I c o n ( " f o l d e r / b a c k 2 . p n g " ) ;  
 / /                 I m a g e I c o n   c o p y   =   n e w   I m a g e I c o n ( " f o l d e r / c o p y . p n g " ) ;  
 / /                 I m a g e I c o n   c o p y 2   =   n e w   I m a g e I c o n ( " f o l d e r / c o p y 2 . p n g " ) ;  
 / /                 I m a g e I c o n   f r o n t   =   n e w   I m a g e I c o n ( " f o l d e r / f r o n t . p n g " ) ;  
 / /                 I m a g e I c o n   f r o n t 2   =   n e w   I m a g e I c o n ( " f o l d e r / f r o n t 2 . p n g " ) ;  
 / /                 I m a g e I c o n   p a s t e   =   n e w   I m a g e I c o n ( " f o l d e r / p a s t e . p n g " ) ;  
 / /                 I m a g e I c o n   p a s t e 2   =   n e w   I m a g e I c o n ( " f o l d e r / p a s t e 2 . p n g " ) ;  
 / /                 I m a g e I c o n   l e f t r o t a t i o n   =   n e w   I m a g e I c o n ( " f o l d e r / l e f t r o t a t i o n . p n g " ) ;  
 / /                 I m a g e I c o n   l e f t r o t a t i o n 2   =   n e w   I m a g e I c o n ( " f o l d e r / l e f t r o t a t i o n 2 . p n g " ) ;  
 / /                 I m a g e I c o n   r i g h t r o t a t i o n   =   n e w   I m a g e I c o n ( " f o l d e r / r i g h t r o t a t i o n . p n g " ) ;  
 / /                 I m a g e I c o n   r i g h t r o t a t i o n 2   =   n e w   I m a g e I c o n ( " f o l d e r / r i g h t r o t a t i o n 2 . p n g " ) ;  
 / /                 I m a g e I c o n   c o l o r   =   n e w   I m a g e I c o n ( " f o l d e r / c o l o r . p n g " ) ;  
 / /                 I m a g e I c o n   c o l o r 2   =   n e w   I m a g e I c o n ( " f o l d e r / c o l o r 2 . p n g " ) ;  
 / /                 I m a g e I c o n   l i n e   =   n e w   I m a g e I c o n ( " f o l d e r / l i n e . p n g " ) ;  
 / /                 I m a g e I c o n   l i n e 2   =   n e w   I m a g e I c o n ( " f o l d e r / l i n e 2 . p n g " ) ;  
 / /                 I m a g e I c o n   e r a s e   =   n e w   I m a g e I c o n ( " f o l d e r / e r a s e . p n g " ) ;  
 / /                 I m a g e I c o n   e r a s e 2   =   n e w   I m a g e I c o n ( " f o l d e r / e r a s e 2 . p n g " ) ;  
 / /  
 / /                 I m a g e [ ]   o r g _ i m a g e   =   n e w   I m a g e [ 9 ] ;  
 / /                 I m a g e [ ]   c h _ i m a g e   =   n e w   I m a g e [ 9 ] ;  
 / /                 I m a g e I c o n [ ]   o r g _ i c o n   =   n e w   I m a g e I c o n [ 9 ] ;  
 / /                 I m a g e I c o n [ ]   c h _ i c o n   =   n e w   I m a g e I c o n [ 9 ] ;  
 / /  
 / /                 o r g _ i m a g e [ 0 ]   =   b a c k . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 1 ]   =   f r o n t . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 2 ]   =   c o p y . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 3 ]   =   p a s t e . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 4 ]   =   l e f t r o t a t i o n . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 5 ]   =   r i g h t r o t a t i o n . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 6 ]   =   c o l o r . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 7 ]   =   l i n e . g e t I m a g e ( ) ;  
 / /                 o r g _ i m a g e [ 8 ]   =   e r a s e . g e t I m a g e ( ) ;  
 / /  
 / /                 c h _ i m a g e [ 0 ]   =   b a c k 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 1 ]   =   f r o n t 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 2 ]   =   c o p y 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 3 ]   =   p a s t e 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 4 ]   =   l e f t r o t a t i o n 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 5 ]   =   r i g h t r o t a t i o n 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 6 ]   =   c o l o r 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 7 ]   =   l i n e 2 . g e t I m a g e ( ) ;  
 / /                 c h _ i m a g e [ 8 ]   =   e r a s e 2 . g e t I m a g e ( ) ;  
 / /  
 / /                 f o r   ( i n t   i   =   0 ;   i   <   o r g _ i m a g e . l e n g t h ;   i + + )   {  
 / /                         o r g _ i m a g e [ i ]   =   o r g _ i m a g e [ i ] . g e t S c a l e d I n s t a n c e ( 4 0 ,   4 0 ,   I m a g e . S C A L E _ S M O O T H ) ;  
 / /                 }  
 / /  
 / /                 f o r   ( i n t   i   =   0 ;   i   <   c h _ i m a g e . l e n g t h ;   i + + )   {  
 / /                         c h _ i m a g e [ i ]   =   c h _ i m a g e [ i ] . g e t S c a l e d I n s t a n c e ( 4 0 ,   4 0 ,   I m a g e . S C A L E _ S M O O T H ) ;  
 / /                 }  
 / /  
 / /                 f o r   ( i n t   i   =   0 ;   i   <   o r g _ i c o n . l e n g t h ;   i + + )   {  
 / /                         o r g _ i c o n [ i ]   =   n e w   I m a g e I c o n ( o r g _ i m a g e [ i ] ) ;  
 / /                 }  
 / /  
 / /                 f o r   ( i n t   i   =   0 ;   i   <   c h _ i c o n . l e n g t h ;   i + + )   {  
 / /                         c h _ i c o n [ i ]   =   n e w   I m a g e I c o n ( c h _ i m a g e [ i ] ) ;  
 / /                 }  
 / /  
 / /  
 / /                 t b . s e t B a c k g r o u n d ( C o l o r . w h i t e ) ;  
 / /                 t b . s e t L a y o u t ( n e w   F l o w L a y o u t ( ) ) ;  
 / /  
 / /  
 / /                 J B u t t o n [ ]   b t n   =   n e w   J B u t t o n [ 9 ] ;  
 / /  
 / /                 f o r   ( i n t   i   =   0 ;   i   <   b t n . l e n g t h ;   i + + )   {  
 / /                         b t n [ i ]   =   n e w   J B u t t o n ( o r g _ i c o n [ i ] ) ;  
 / /                         t b . a d d ( b t n [ i ] ) ;  
 / /                         b t n [ i ] . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 4 0 ,   4 0 ) ) ;  
 / /                         b t n [ i ] . s e t R o l l o v e r I c o n ( c h _ i c o n [ i ] ) ;  
 / /                         b t n [ i ] . s e t B o r d e r P a i n t e d ( t r u e ) ;  
 / /                         t b . a d d S e p a r a t o r ( ) ;  
 / /                 }  
 / /  
 / /                 t b . a d d S e p a r a t o r ( ) ;  
 / /  
 / /                 J L a b e l   s i z e l a b e l   =   n e w   J L a b e l ( " T e x t   S i z e " ) ;  
 / /                 s i z e l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 6 0 ,   4 0 ) ) ;  
 / /                 t b . a d d ( s i z e l a b e l ) ;  
 / /                 t b . a d d ( s p i n n e r ) ;  
 / /  
 / /                 t b . a d d S e p a r a t o r ( ) ;  
 / /  
 / /                 J L a b e l   f o n t l a b e l   =   n e w   J L a b e l ( " F o n t s " ) ;  
 / /                 f o n t l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 4 0 , 4 0 ) ) ;  
 / /                 c o m b o . a d d I t e m ( " ѹ@�  ��" ) ;  
 / /                 c o m b o . a d d I t e m ( " �����" ) ;  
 / /                 c o m b o . a d d I t e m ( " h��q����" ) ;  
 / /                 t b . a d d ( f o n t l a b e l ) ;  
 / /                 t b . a d d ( c o m b o ) ;  
  
         }  
  
 } 