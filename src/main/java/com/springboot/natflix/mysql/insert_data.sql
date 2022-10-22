INSERT INTO content_type (id, type)
VALUES (1,'tv-series'),
       (2,'movies'),
       (3,'documentary');

INSERT INTO content_category (id, category)
VALUES (1,'Horror'),
       (2,'Action'),
       (3,'Comedy'),
       (4,'Drama'),
       (5,'Other');

INSERT INTO content (id,title,type_id,category_id,summary,logo_url,poster_url,banner_url,thumbnail_url)
VALUES (1,'Seinfield',1,3,'The show about nothing is a sitcom landmark, with comic Jerry and his three sardonic friends finding laughs in both the mundane and the ridiculous','/fake-images/logos/1.png','/fake-images/posters/1.png','/fake-images/banners/1.png','/fake-images/thumbnails/1.png'),
       (2,'Gundam II',1,2,'Amet commodo nulla facilisi nullam vehicula ipsum.',null,null,null,'/fake-images/thumbnails/2.png'),
       (3,'Uncoupled',1,3,'Ipsum dolor sit amet consectetur adipiscing elit ut.',null,null,null,'/fake-images/thumbnails/3.png'),
       (4,'Archer',1,3,'Pellentesque habitant morbi tristique senectus et netus et malesuada fames.',null,null,null,'/fake-images/thumbnails/4.png'),
       (5,'Ghost in the Shell SAC 2045',1,2,'At erat pellentesque adipiscing commodo.  Nam libero justo laoreet sit amet cursus sit amet.',null,null,null,'/fake-images/thumbnails/5.png'),
       (6,'Cowboy Bebop',1,2,'Tincidunt eget nullam non nisi est sit. Neque laoreet suspendisse interdum consectetur libero id.',null,null,null,'/fake-images/thumbnails/6.png'),
       (7,'Money Heist',1,2,'Sem nulla pharetra diam sit amet nisl. Massa malesuada proin.',null,null,null,'/fake-images/thumbnails/7.png'),
       (8,'Narcos Mexico',1,4,'Nisl rhoncus mattis rhoncus urna neque viverra. Eget lorem dolor enim.',null,null,null,'/fake-images/thumbnails/8.png'),
       (9,'Gundam Char Counter Attack', 1,2,'Tempus quam pellentesque nec nam aliquam. Posuere sollicitudin aliquam ultrices sagittis orci a scelerisque.',null,null,null,'/fake-images/thumbnails/9.png'),
       (10,'Neon Genesis Evangelion',1, 2,'Iaculis eu non diam phasellus vestibulum lorem sed risus. Nullam eget attis. Orci mauris augue neque gravida.',null,null,null,'/fake-images/thumbnails/10.png'),
       (11,'Designated Survivor',1,4,'Lorem ipsum dolor sit amet, consectetur  labore et dolore magna aliqua.',null,null,null,'/fake-images/thumbnails/11.png'),
       (12,'Queen Gambit',1,4,'Amet commodo nulla facilisi nullam vehicula ipsum. Felis bibendum ut tristique et egestas quis ipsum.',null,null,null,'/fake-images/thumbnails/12.png'),
       (13,'Community',1,3,'Ipsum dolor sit amet consectetur adipiscing elit ut.Rhoncus dolor purus non enim. Id m quisque non.',null,null,null,'/fake-images/thumbnails/13.png'),
       (14,'Vikings',1,2,'Pellentesque netus et malesuada fames. Mauris  pulvinar pellentesque.',null,null,null,'/fake-images/thumbnails/14.png'),
       (15,'Better Call Saul',1,4,'At erat pellentesqut amet cursus sit amet.',null,null,null,'/fake-images/thumbnails/15.png'),
       (16,'Servant of the people',2,2,'A political satire comedy about a high-school history teacher in his thirties who is unexpectedly elected President after a viral video filmed by one of his students shows him making a profane rant against government corruption.',null,null,'/fake-images/banners/16.png','/fake-images/thumbnails/16.png'),
       (17,'Mission Impossible Fallout',2,2,'Sem nulla pharetra diam sit amet nisl. Massa tincidunt nuer malesuada proin.',null,null,null,'/fake-images/thumbnails/17.png'),
       (18,'Do not Look Up',2,3,'Nisl rhoncus mattis rhoncus urna neque uet bibendum enim.',null,null,null,'/fake-images/thumbnails/18.png'),
       (19,'Heat',2,2,'Tempus quam pellentesqueodio facilisis mauris sit amet. Posuere sollicitudin aliquam ultrices sagittis orci a scelerisque.',null,null,null,'/fake-images/thumbnails/19.png'),
       (20,'Groundhog Day',2,4,'Iaculis eu Nullam eget felis eget nunc lobortis mattis. Orci ac auctor augue mauris augue neque gravida.',null,null,null,'/fake-images/thumbnails/20.png'),
       (21,'Moneyball',2,2,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',null,null,null,'/fake-images/thumbnails/21.png'),
       (22,'The last dance',3,5,'Directed by Jason Hehir, the series revolves around the career of Michael Jordan, with particular focus on the 1997 season, his final season with the Chicago Bulls.',null,null,'/fake-images/banners/22.png','/fake-images/thumbnails/22.png'),
       (23,'Blackfish',3,5,'Ipsum dolor sit amet consectetur adipiscing elit ut. Rhoncus drerit gravida rutrum quisque non.',null,null,null,'/fake-images/thumbnails/23.png'),
       (24,'Fear city',3,5,'Pellentesquevel elit scelerisque mauris pellentesque pulvinar pellentesque.',null,null,null,'/fake-images/thumbnails/24.png'),
       (25,'The Guns of Navarrone',3, 5,'At erat pellentesque adipiscing commodo. Augue eget arcu sit amet.',null,null,null,'/fake-images/thumbnails/25.png'),
       (26,'Outlander',3,5,'Tincidunt eget nullam non nisi est sit. Facilisis gravida  suspendisse interdum consectetur libero id.',null,null,null,'/fake-images/thumbnails/26.png'),
       (27,'Iron fist Kung fu Kicks',3,5,'Sed risus pretium quam vulputate. Massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada proin.',null,null,null,'/fake-images/thumbnails/27.png'),
       (28,'Cyberpunk 2770: Edgerunners',1,3,'In a dystopia riddled with corruption and cybernetic implants, talented but reckless street kid strives to become a mercenary outlaw -an edgerunner.','/fake-images/logos/28.png',null,'/fake-images/banners/28.png',null);
