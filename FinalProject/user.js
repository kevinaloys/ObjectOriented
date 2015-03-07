db.user.drop();

db.user.insert({
    id : 1,
	name : { first : "Kevin", last : "Aloysius" },
	age : 22,
	email : 'kevinaloys@rocketmail.com',
	cardexpiry : 2018,
    diet : ['high sugar','high sodium','high gluten','high protein'],
	calories : {
		'January':1234,
		'February':25434,
		'March' : 53424,
		'April' : 2543,
		'May' : 24321,
		'June' : 25421,
		'July' : 5111,
		'August' : 5212,
		'September' : 5112,
		'October' : 2531,
		'November' : 24123,
		'December' : 52213
		},
	expenses : {
		'January': 254,
		'March' : 231,
		'April' : 512,
		'May' : 132,
		'June' : 512,
		'July' : 631,
		'August' : 122,
		'September' : 512,
		'October' : 66,
  		'November' : 652,
		'December' : 112
		}
	});

db.user.insert({
        name : { first : "Larry", last : "Page" },
        id : 2,
        age : 44,
        email : 'larrypage@google.com',
        cardexpiry : 2016,
        diet : ['low sugar','low sodium','low gluten','high protein'],
        calories : {
                'January':2134,
                'February':51434,
                'March' : 4324,
                'April' : 25443,
                'May' : 4321,
                'June' : 65421,
                'July' : 411,
                'August' : 5212,
                'September' :5112,
                'October' : 6531,
                'November' : 84123,
                'December' : 6213
                },
        expenses : {
                'January': 154,
                'March' : 131,
                'April' : 412,
                'May' : 152,
                'June' : 752,
                'July' : 241,
                'August' : 632,
                'September' : 642,
                'October' : 616,
                'November' : 62,
                'December' : 72
                }
        });
