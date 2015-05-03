Shooter-Tycoon
==============

Another simple clicker game, this is simply a test.

----------- Version 0.0.4 Build 10 -----------
- Fixed the bug with the bullet price increasing beyond 2 decimal places.
- Adjusted the level increase formula. I think it's much more thought out and well implemented. Here's a basic shapshot of levels 1-8: http://puu.sh/hwVHT/92fe02ddb1.png

----------- Version 0.0.4 Build 9  ----------- 
 - Added basic infrastructure for the upgrades tab   
 - Included a leveling system for creating bullets. Leveling up lets you create one more bullet each click and increases the value of each bullet by 1.25 (Will be adjusted, just getting the basic structure in)   
 - Reworked a bit of the overall code. I left the poor project quite messy when I was last working on it.   
 - Moved mostly everything dealing with the upgrade tab to it's own class. I was going to do this before, however I was still very new to java and wasn't sure how to go about it.    
 ----What's Next----
 - A more thought out and well adjusted leveling system.   
 - A few more "skills" to grind out   
 - A new tab dedicated to your levels   
 - A "true" upgrades tab, dealing with different tech. Such as "A better tool for creating bullets" or "A new type of bullet" etc. etc.   
 - Different types of bullets, all with their own art. Possibly going into gun production instead of bullets as a possible upgrade path.   
 - Overall better code, I still feel as though a lot of the code is messy and not very well  thought out.   

-----------  Version 0.0.3 Build 7  -----------
- Fixed a bug (This took me a couple of very annoying Google searching hours to fix)
that caused your money to have very long decimals like 12.000000000001

-----------  Version 0.0.3 Build 6  -----------
- Added a working tab system! The tab system makes it possible to add
different tabs which hold different content. Currently there are only 2
tabs, the main game tab and the upgrades tab. The upgrades tab is
currently empty, with plans to add upgrades in 0.0.4. This took me much
much longer to figure out how to do than I expected. Enjoy it.
- This is a bit under-the-hood, but I reworked the drawing engine so now
the main game tab is drawn through it's own class(I should have made it
this way from the beginning).
- Added the version number to the bottom left hand corner of the main
game tab, just so you know what you're running.

What's Next:
- Upgrades! 
- More tabs(Probably a stats tab. I'll think of more(I swear))
- I have a list of things I want to add of my phone, this list is things
I can do now, not later on.
- I have mixed feelings on adding this, but a leveling system. You start
at level 1 of course and then as you create bullets(and later guns(after
I add it of course)) you gain XP. Leveling up increases the amount of
bullets you can make at one time. Like I said I have mixed feelings
about this so feedback is greatly appreciated.

-----------  Version 0.0.2 Build 4  -----------
- A very tiny update, added a limit to the amount of bullets you can have at one time. Sell the bullets to reset the limit back to zero.

-----------  Version 0.0.2 Build 3  -----------    
- Added a button that allows you to sell
all of your current bullets. Each bullet 
is worth $0.25. 
- This was just a short little update
to allow you to sell your bullets. Next 
update (Hopefully) I will allow the 
game to support tabs. These tabs will
hopefully allow for a cleaner looking 
interface and hopefully allow for more 
features to be added in the future!

-----------  Version 0.0.1 Build 1  -----------
- Added a resource folder for all of the 
sprites. Currently only has one sprite,
which is a simple pistol bullet.
- Created a simple window for the game to
play in (1100 by 688 for now)
- Added a button, which uses a unique
pistol bullet sprite,in which, 
when clicked, will add 16 "bullets"
 to your total amount.
Later this while be upgradable.


What's next:

- Will add a capacity in which will limit
the amount of bullets you can store at 
once. 
- Will add the ability to sell bullets 
for money, which will be used for 
upgrading.
- Will add upgrades which will increase
the number of bullets you can create,
will increase your carrying capacity,
and will eventually increase sell price.

-----------  Version 0.0  -----------
   -   Initial commit, this is simply an empty project.
   
