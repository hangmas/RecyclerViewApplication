package com.recyclerview.listadapterrecyclerview.model

data class NetflixTitles(
        val show_id:String,
        val type:String,
        val title:String,
        val director:String,
        val cast:String,
        val country:String,
        val date_added:String,
        val release_year:Int,
        val rating:String,
        val duration:String,
        val listed_in:String,
        val description:String

) {}


val titlesList= listOf(
        NetflixTitles("s1","TV Show","3%","","João Miguel, Bianca Comparato, Michel Gomes, Rodolfo Valente, Vaneza Oliveira, Rafael Lozano, Viviane Porto, Mel Fronckowiak, Sergio Mamberti, Zezé Motta, Celso Frateschi","Brazil","August 14, 2020",2020,"TV-MA","4 Seasons","International TV Shows, TV Dramas, TV Sci-Fi & Fantasy","In a future where the elite inhabit an island paradise far from the crowded slums, you get one chance to join the 3% saved from squalor."),
        NetflixTitles("s2","Movie","7:19","Jorge Michel Grau","Demián Bichir, Héctor Bonilla, Oscar Serrano, Azalia Ortiz, Octavio Michel, Carmen Beato","Mexico","December 23, 2016",2016,"TV-MA","93 min","Dramas, International Movies","After a devastating earthquake hits Mexico City, trapped survivors from all walks of life wait to be rescued while trying desperately to stay alive."),
        NetflixTitles("s3","Movie","23:59","Gilbert Chan","Tedd Chan, Stella Chung, Henley Hii, Lawrence Koh, Tommy Kuan, Josh Lai, Mark Lee, Susan Leong, Benjamin Lim","Singapore","December 20, 2018",2011,"R","78 min","Horror Movies, International Movies","When an army recruit is found dead, his fellow soldiers are forced to confront a terrifying secret that's haunting their jungle island training camp."),
        NetflixTitles("s4","Movie","​Goli Soda 2","Vijay Milton","Samuthirakani, Bharath Seeni, Vinoth, Esakki Barath, Chemban Vinod Jose, Gautham Menon, Krisha Kurup, Subiksha","India","September 15, 2018",2018,"TV-14","128 min","Action & Adventure, Dramas, International Movies","A taxi driver, a gangster and an athlete struggle to better their lives despite obstacles like crooked politicians, evil dons and caste barriers."),
        NetflixTitles("s5","Movie","Maj Rati ​​Keteki","Santwana Bardoloi","Adil Hussain, Shakil Imtiaz, Mahendra Rabha, Sulakshana Baruah, Rahul Gautam Sarma, Kulada Bhattacharjya, Indu Mohan Das, Moumita Talukdar","India","September 15, 2018",2017,"TV-14","117 min","Dramas, International Movies","A successful writer returns to the town that launched his career, encountering people who spark nostalgic, often painfully illuminating flashbacks."),
        NetflixTitles("6","TV Show","SAINT SEIYA: Knights of the Zodiac","","Bryson Baugus, Emily Neves, Blake Shepard, Patrick Poole, Luci Christian, Adam Gibbs, Masakazu Morita, Fumiko Orikasa, Takahiro Sakurai, Hiroaki Miura, Satomi Sato, Katsuyuki Konishi","Japan","January 23, 2020",2020,"TV-14","2 Seasons","Anime Series, International TV Shows","Seiya and the Knights of the Zodiac rise again to protect the reincarnation of the goddess Athena, but a dark prophecy hangs over them all."),
        NetflixTitles("s7","Movie","(T)ERROR","Lyric R. Cabral, David Felix Sutcliffe","","United States","June 30, 2016",2015,"NR","84 min","Documentaries","This real-life look at FBI counterterrorism operations features access to both sides of a sting: the government informant and the radicalized target."),
        NetflixTitles("s8","TV Show","(Un)Well","","","United States","August 12, 2020",2020,"TV-MA","1 Season","Reality TV","This docuseries takes a deep dive into the lucrative wellness industry, which touts health and healing. But do the products live up to the promises?"),
        NetflixTitles("s9","Movie","¡Ay, mi madre!","Frank Ariza","Estefanía de los Santos, Secun de la Rosa, Terele Pávez, María Alfonsa Rosso, Mariola Fuentes, Alfonso Sánchez, Paz Vega, Marta Torné, Concha Galán","Spain","July 19, 2019",2019,"TV-MA","81 min","Comedies, International Movies","When her estranged mother suddenly dies, a woman must follow the quirky instructions laid out in the will in order to collect an important inheritance."),
        NetflixTitles("s10","Movie","Çarsi Pazar","Muharrem Gülmez","Erdem Yener, Ayhan Taş, Emin Olcay, Muharrem Gülmez, Elif Nur Kerkük, Tarık Papuççuoğlu, Suzan Aksoy, Doğa Konakoğlu, Esin Eden, Deniz Özerman","Turkey","March 10, 2017",2015,"TV-14","97 min","Comedies, International Movies","The slacker owner of a public bath house rallies his community to save it when a big developer comes to town to close it down and open a new mall."),
        NetflixTitles("s11","Movie","Ég man þig","Óskar Thór Axelsson","Jóhannes Haukur Jóhannesson, Ágústa Eva Erlendsdóttir, Elma Stefania Agustsdottir, Thor Kristjansson, Anna Gunndís Guðmundsdóttir, Sara Dögg Ásgeirsdóttir, Þröstur Leó Gunnarsson, Jóhann Sigurðarson, Sveinn Geirsson, Arnar Páll Harðarson","Iceland","March 27, 2018",2017,"TV-MA","106 min","Horror Movies, International Movies","Young urbanites renovating a rundown house, and a psychiatrist grieving his son's disappearance, are connected to a supernatural, decades-old secret."),
        NetflixTitles("s12","Movie","Çok Filim Hareketler Bunlar","Ozan Açıktan","Ayça Erturan, Aydan Taş, Ayşegül Akdemir, Burcu Gönder, Bülent Emrah Parlak, Büşra Pekin, Emre Canpolat, Ersin Korkut, Eser Yenenler, Gizem Tuğral, Gülhan Tekin, Gülsüm Alkan, Hamdi Kahraman, İbrahim Büyükak, Metin Keçeci","Turkey","March 10, 2017",2010,"TV-MA","99 min","Comedies, International Movies","Vignettes of the summer holidays follow vacationers as they battle mosquitoes, suffer ruined plans and otherwise hit snags in their precious time off."),
        NetflixTitles("s13","Movie","Òlòtūré","Kenneth Gyang","Beverly Osu, Sharon Ooja, Omowunmi Dada, Pearl Okorie, Wofai Samuel, Ikechukwu Onunaku, Kemi Lala Akindoju, Blossom Chukwujekwu, Adebukola Oladipupo, Omoni Oboli, Segun Arinze, Ada Ameh, Sambasa Nzeribe, Patrick Doyle, Gregory Ojefua","Nigeria","October 2, 2020",2020,"TV-MA","107 min","Dramas, International Movies","In Lagos, a journalist goes undercover as a prostitute to expose human trafficking. What she finds is a world of exploited women and ruthless violence."),
        NetflixTitles("s14","Movie","1 Chance 2 Dance","Adam Deyoe","Lexi Giovagnoli, Justin Ray, Rae Latt, Poonam Basu, Teresa Biter, Kalilah Harris, Alexia Dox, Adam Powell, Sean McBride","United States","July 1, 2017",2014,"TV-PG","89 min","Dramas, Romantic Movies","When an aspiring dancer is uprooted during her senior year of high school, she finds herself torn between two boys – and with one shot at her dream."),
        NetflixTitles("s15","Movie","1 Mile to You","Leif Tilden","Billy Crudup, Graham Rogers, Liana Liberato, Stefanie Scott, Tim Roth, Melanie Lynskey, Thomas Cocquerel, Peter Coyote","United States","July 7, 2017",2017,"TV-14","105 min","Dramas, Romantic Movies, Sports Movies","After escaping the bus accident that killed his girlfriend, a high school student channels his grief into running, with the help of a new coach."),
        NetflixTitles("s16","Movie","2 States","Abhishek Varman","Alia Bhatt, Arjun Kapoor, Ronit Roy, Amrita Singh, Revathy, Aru Krishansh Verma","India","August 4, 2018",2014,"TV-PG","143 min","Comedies, Dramas, International Movies","Graduate students Krish and Ananya hope to win their parents' approval before they marry, but the two families clash over their cultural differences."),
        NetflixTitles("s17","Movie","A Cinderella Story: Christmas Wish","Michelle Johnston","Laura Marano, Gregg Sulkin, Isabella Gomez, Johannah Newmarch, Lillian Doucet-Roche, Chanelle Peloso, Barclay Hope, Garfield Wilson","United States","December 1, 2019",2019,"PG","86 min","Children & Family Movies, Comedies, Music & Musicals","Despite her vain stepmother and mean stepsisters, an aspiring singer works as an elf at a Christmas tree lot and finds her own holiday miracle."),
        NetflixTitles("s18","TV Show","A Little Thing Called First Love","","Lai Kuan-lin, Zhao Jinmai, Wang Runze, Chai Wei, Wang Bowen","China","October 26, 2019",2019,"TV-G","1 Season","International TV Shows, Romantic TV Shows, Teen TV Shows","A shy college student with a knack for drawing develops a crush on a musically gifted classmate and embarks on a journey of self-discovery."),
        NetflixTitles("s19","TV Show","A Love So Beautiful","","Kim Yo-han, So Joo-yeon, Yeo Hoi-hyun, Jeong Jin-hwan, Jo Hye-joo, Yun Seo-hyun, Cho Ryun, Kim Sung-gon, Seong Hye-min, Park Ji-won","South Korea","December 28, 2020",2020,"TV-PG","1 Season","International TV Shows, Romantic TV Shows, TV Comedies","Love is as tough as it is sweet for a lovestruck teenager, whose relationship with her next-door neighbor transforms as they grow into adulthood."),
        NetflixTitles("s20","Movie","Baahubali: The Beginning (Hindi Version)","S.S. Rajamouli","Prabhas, Rana Daggubati, Anushka Shetty, Tamannaah Bhatia, Sathyaraj, Nassar, Ramya Krishnan, Sudeep","India","August 7, 2017",2015,"TV-14","159 min","Action & Adventure, Dramas, International Movies","Villagers in the kingdom of Mahismati rescue a baby who is destined to embark on a heroic quest in this Hindi version of S.S. Rajamouli's epic.")
)