db.user.drop();

db.user.insert({
    id : 1,
	name : { first : "Kevin", last : "Aloysius" },
	age : 22,
	email : 'kevinaloys@rocketmail.com',
	cardexpiry : 2018,
    diet : ['high sugar','high sodium'],
    calorieperday : 2000,
    funds : 50,
	calories : {
		'January': 60000,
		'February': 64000,
		'March' : 70000,
		'April' : 62000,
		'May' : 78000,
		'June' : 61000,
		'July' : 71000,
		'August' : 85000,
		'September' : 16000,
		'October' : 60000,
		'November' : 63000,
		'December' : 78000
		},
	expenses : {
		'January': 254,
		'March' : 231,
        'February':400,
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
        name : { first : "Varada", last : "Gurjar" },
        id : 2,
        age : 44,
        email : 'larrypage@google.com',
        cardexpiry : 2016,
        diet : ['low sugar','low sodium'],
        calorieperday: 2200,
        funds : 50,
        calories : {
                'January':61000,
                'February':74000,
                'March' : 85000,
                'April' : 65000,
                'May' : 71000,
                'June' : 62000,
                'July' : 46000,
                'August' : 720500,
                'September' :65100,
                'October' : 65300,
                'November' : 72000,
                'December' : 75000
                },
        expenses : {
                'January': 154,
                'February': 196,
                'March' : 131,
                'April' : 412,
                'May' : 152,
                'June' : 452,
                'July' : 241,
                'August' : 422,
                'September' : 512,
                'October' : 416,
                'November' : 162,
                'December' : 72
                }
        });
