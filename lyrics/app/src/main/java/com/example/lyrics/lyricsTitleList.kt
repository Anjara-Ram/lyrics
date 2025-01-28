package com.example.lyrics

var numberListData = (1..428).toList().toTypedArray()


var titleListData = arrayOf(
    "Misaotra Anao 'zahay Ry Ray",//1
    "Isaorana anie Andriamanintsika",//2
    "Mamy ny fitiavanao",//3
    "Misaotra Anao zahay Andriamanitra o",//4
    "Misaora an'i Zanahary",//5
    "Midera ny anaranao",//6
    "Andriamanitra he mahagaga",//7
    "Avia ry vazantany o",//8
    "Feno hafaliana ny foko raha nilazana hoe",//9
    "Mamin'ny foko",//10
    "Jesosy namonjy ahy",//11
    "La force en Christ",//12
    "Misy Hery ao amin'ny Rà",//13
    "Misaotra Anao zahay ry Jehovah Ray o",//14
    "Mais oui le Seigneur est Bon",//15
    "Aoka Tsy hisy olona hanao",//16
    "Ny foko ry mpamonjy",//17
    "Avec des cris de Joie",//18
    "Ny lanitra ao ambony ao",//19
    "Attaché à la croix",//20
    "Andriamanitra fitiavana",//21
    "Crie de joie",//22
    "Mivavaha, mivavaha",//23
    "Andriamanitra mahery",//24
    "Gloire à ton nom Jesus ",//25
    "Atolotro anao Andriamanitra o",//26
    "Ny feonay rehetra",//27
    "Jesoa longo soa",//28
    "Nous venons dans ta maison",//29
    "Ry Jesoa ny fitiavanao",//30
    "Ry Raiko feno antra (FFPM 444)",//31
    "Tsaroanay tokoa izao",//32
    "Raha olon'irery",//33
    "Dieu tout puissant",//34
    "He ny andon'ny maraina",//35
    "Ô! Nivoha",//36
    "Jean 3: 16",//37
    "Tendre Père",//38
    "Dera laza hery haja",//39
    "Anao aho Tompo Ô!",//40
    "Tompo Ô! An-tananao tokoa",//41
    "Endrey ny fitiavan-dehibe",//42
    "Misy maro an-tsaha",//43
    "Jesus est au milieu de nous",//44
    "Andriamanitra Ô!",//45
    "Si tu confesses",//46
    "Maniry mafy aho",//47
    "Nahafoy ny aiko aho",//48
    "Prend ma vie dans tes bras",//49
    "Jesoa tia ny fanahiko",//50
    "Ahy Jeso",//51
    "Tsy haiko ny tsy hisaotra Anao",//52
    "Le Seigneur nous a aimés",//53
    "Jesoa apetrako aminao",//54
    "Quel jour de gloire",//55
    "Lehibe tsy manam-paharoa",//56
    "Ao am-ponao Jesoa",//57
    "Sitrako tokoa",//58
    "Aina no fetra",//59
    "Aza manadino ahy",//60
    "He ny fiantsonana",//61
    "Izaho ry Jesosy",//62
    "Il est beau (Psaume 92:2-5;S-6)",//63
    "Na ao an-dohasaha",//64
    "Feno fiderana anao",//65
    "Raha ny oloko",//66
    "Tsy misy soa ahy afa-tsy Jesoa",//67
    "Rehefa misaina",//68
    "Endrey ny hamaroan'ny soa",//69
    "Hafaliana",//70
    "Matetika manonja re",//71
    "Ô izany diako",//72
    "Raha niala tao an-trano",//73
    "Inty ny tenako Atolotro",//74
    "Je veux chanter",//75
    "'Zaho mino",//76
    "Ianareo 'zay lavitra taloha",//77
    "Indro ny Tompo Jesosy jereo",//78
    "Ry Jeso loharanon'aina",//79
    "Louange",//80
    "Ny miara-dia",//81
    "Ry Tompo Andriamanitra Andriananahary",//82
    "Faly dia faly",//83
    "Je suis jeune et délivré",//84
    "Fandresena",//85
    "Sahaza ny olona rehetra Jesosy",//86
    "Fitiavana rano velona",//87
    "Mba soraty ao am-poko",//88
    "Si mon peuple",//89
    "Ny teny masinao Jehovah Tompo ô",//90
    "He sambatra aho Jesoa",//91
    "Akaikin'izay miantso Azy",//92
    "Ma joie de t'appartenir",//93
    "Ô Mideza ity lalako",//94
    "Misy didy tena tsara",//95
    "Je louerai l'Eternel",//96
    "Tompo ô mba te hihaona",//97
    "Ekeko ry Tompo",//98
    "Aza avela ho mandalo re ny teny",//99
    "Vers Toi Seigneur",//100
    "Reko izao ry Tompo",//101
    "Par le nom de Jesus",//102
    "Fafao ny foko re anio",//103
    "Ry Tompo mpamonjiko malala",//104
    "Vaovao mahafaly",//105
    "Si tu savais combien",//106
    "Inona re no atakaloko",//107
    "Faly ny fo rabo tokoa",//108
    "Havaozy ny foko",//109
    "Sambatra aho miaraka Aminy",//110
    "Hijoro aho Jeso",//111
    "He fantatro f'indray andro any",//112
    "Mamafaza voa",//113
    "Les mains ouvertes",//114
    "Omeo an'i Jesoa",//115
    "'Zany teninao ry Tompo",//116
    "Tenin'i Kristy no ianteherako",//117
    "Apetrako ny foko",//118
    "Jeso mora fo indrindra",//119
    "Tompo ô ovay ny foko",//120
    "Ao ny lanitra tsara tokoa",//121
    "Je te chante une mélodie",//122
    "Jesus mon bien aimmé",//123
    "Tsy mba misy zava-tsoa",//124
    "Nous sommes un",//125
    "Hosana, Hosana ",//126
    "Voavonjy isika",//127
    "Quelle grace",//128
    "Iza no hahasaraka ahy",//129
    "Ô ry mpanota aza mandà",//130
    "Jesoa mpanjaka malaza",//131
    "Ry fanahy mpanazva",//132
    "Tamin'ny fo",//133
    "Mon Dieu est si grand",//134
    "Rehefa tonga ny maraina",//135
    "Ela izay no nialako",//136
    "Faingàna ry Mpanjaka",//137
    "A toi la gloire",//138
    "Ny eo akaikinao ry Ray",//139
    "Entre tes mains",//140
    "Fitia Agape",//141
    "Ilay hazo fijaliana",//142
    "Maranatha",//143
    "Aza izahay",//144
    "Avia ry mino",//145
    "Alina masina",//146
    "Tsy misy lehibe noho Andriamanitra",//147
    "Indro zazakely",//148
    "Aminao Jehovah ô no andandratako ...",//149
    "Mihanoa mihainoa",//150
    "Ilaiko Jesosy",//151
    "Hajain'ny saiko",//152
    "Nitondra zaza",//153
    "Tia zaza",//154
    "Enfants de la même Cité",//155
    "Raha aizim-pito manarona anao",//156
    "Efa velona ny Tompo",//157
    "Ario ny tahotrao",//158
    "Ilazao Jesosy",//159
    "Satria velona Izy",//160
    "Fandresena teo aloha",//161
    "N'aiza n'aiza hoy Jeso",//162
    "Vimbino tsara izahay",//163
    "Tafatsangana tokoa",//164
    "Efa resy izao",//165
    "Sur le chemin",//166  MITOVY NY 166 SY NY 167 tokony ovaina ny tonony
    "Je t'exalterai",//167
    "Latsa-paka ato am-poko",//168
    "Manana latabatra",//169
    "He Jehovah no mpiandry ahy",//170
    "Manapa-kevitra aho izao",//171
    "Jesus c'est le plus beau nom",//172
    "N'aiza n'aiza Jeso hitoeranao",//173
    "Tsara lova ry Jeso ô",//174
    "Mihoby ny fanahiko",//175
    "Ny mpamonjiko ny mitady",//176
    "Ny sambokelinay ety",//177
    "Ry JEso mpamonjy malala",//178
    "Jesus m'a sauvé",//179
    "Miara-mizotra",//180
    "Ô ry Raiko izay malala",//181
    "Jesoa mikaroka mpiasa vaovao",//182
    "Vonona aho Tompo hiaraka amianao",//183
    "Jusqu’à la mort",//184
    "Tao Kalvary",//185
    "Sur le mont Calvaire",//186
    "Quand je vois les fleurs",//187
    "Majeste",//188
    "Nahita Sakaiza aho",//189
    "Ny sitrakao no sitrako",//190
    "Reçois favorablement",//191
    "Akaikinao anilanao",//192
    "Anao ny dera",//193
    "Ô! Miasà sakaiza",//194
    "Jesosy irery ihany",//195
    "Ry Jeso masoandronay",//196
    "Ny hiran'ny lanitra",//197
    "Ry Jesosy mba tantano",//198
    "Ahofahofay ny tànanao",//199
    "Jesosy Kapiteninay",//200
    "He matoky aho Tompo",//201
    "Endrey ny hafatra malaza",//202
    "Avia Fanahy ô (FFPM 175)",//203
    "Ny Tompo no miantso manompo",//204
    "Avia Fanahy Masina ô (FFPM 176)",//205
    "Efa tonga aty izao (FFPM 357)",//206
    "Ny teninao rehetra (FFPM 205)",//207
    "Tenin' i Kristy no ianteherako",//208
    "ZAva-tsoa (FFPM 210)",//209
    "Amboninao Jeso",//210
    "Endrika sariaka (FFPM 430)",//211
    "Masina ny lanitra ",//212
    "Henoy ny mpamonjy",//213
    "Ahy va Jesosy Tompon' aina (FFPM 498)",//214
    "Fanoharana iray",//215
    "Izaho anie ka mba maniry",//216
    "Fiadanana e!",//217
    "MAnakaiky Anao isan'andro",//218
    "Azonao an-tsaina ve",//219
    "Moa ny ràn' ny zanak' ondry",//220
    "Aina ny fetra ry Jesosy Tompo",//221
    "Asandratro",//222
    "Qui donc dans le ciel",//223
    "Raiso aho Tompo ô",//224
    "Nous avons decouvert",//225
    "Ry Jeso ô tahio izahay (FFPM 582)",//226
    "Fantatro izay inoako",//227
    "Fiaran-danitra",//228
    "Mandania fotoana amim-bavaka",//229
    "Manan-jara ry Jesosy",//230
    "Ry Sakaizan' ny tanora",//231
    "Ry miaramila ! Mandrospa izao (FFPM 639)",//232
    "Mbola hihaona aho aminao aho",//233
    "Quand j'ai vu tes mains",//234
    "Manontany angamba ianao",//235
    "Alefanay anaty fasika",//236
    "Ny manompo Anao no tiako",//237
    "Hiara-mandeha",//238
    "Ô! Ry mpanota izay milalao",//239
    "Pour cet immense bonheur",//240
    "Je suis chrétien",//241
    "Enga anie ka homba anao Jeso!",//242
    "Jeso nanala ny gadrako",//243
    "Quand l' esprit de Dieu",//244
    "Quand je vois le ciel (Psaumes 8:4,5)",//245
    "Jeso Tompo lehibe",//246
    "Veille et prie",//247
    "Jesus apprends-moi",//248
    "Moa fantatrao ny anara-mahagaga",//249
    "Hitako ny tselatra",//250
    "Lapan' Andriamanitra (FFPM 691)",//251
    "Hitako izao Sakaiza (FFPM 642)",//252
    "Tel que Je suis",//253
    "Any an-danitra any",//254
    "Inona no nahasaraka ahy (FFPM 486)",//255
    "Sambasamba Zanahary (FFPM 79)",//256
    "Merveilleux amour",//257
    "Aoka hita aminao Jesosy",//258
    "Sasa-poana ireo mpitaona",//259
    "Mamela heloka isan' andro",//260
    "Raiso ny fiainako hanjakao",//261
    "Jehovah Ray Malala ô",//262
    "Mba sainonao ange sao tsy mba fantatrao",//263
    "Béni soit le Seigneur",//264
    "Nahantra indrindra aho",//265
    "La foi renverse devant nous",//266
    "La foi renverse devant nous",//267
    "Nandao Anao ela aho (FFPM 417)",//268
    "Faingana Ajoroy ny faneva",//269
    "Eo an-tànanao, ry Raiko (FFPM 462)",//270
    "Iza no hanompo",//271
    "Vatolampy tsy mikoro",//272
    "Ilay fonenana iray",//273
    "Tiako ny miaraka aminao Jeso",//274
    "Hankaiza izahay Jesosy",//275
    "Ô! Mandrosoa ry mpanaraton' i Jeso",//276 texte mifanindry
    "Injany misy feo",//277
    "Efa napetrak'Andriamanitra",//278 texte mifanindry
    "He fantatro anie",//279
    "N'inona n'inona hitranga Jeso",//280
    "Protège-nous",//281
    "Manantona Anao Mpanavotra ô",//282
    "Moa ve vita fihavanana",//283
    "Avec Dieu nous ferons des exploits",//284
    "Fanavaozana izay mahagaga (FFPM 487)",//285
    "Izao no andro farany",//286
    "Iny làlako iny",//287
    "Bénit soit le lien",//288
    "Lion de Juda",//289
    "Je ne sais pas",//290
    "Misaotra an ' Andriamanitra",//291
    "L'amour de Dieu",//292
    "Lavitra akaiky",//293
    "Nitondra ny entako Jesosy",//294
    "Momba anay ry Jeso Tompo ô!",//295
    "Jeso sakaizanay, Jeso anay (FFPM 513)",//296
    "Ny foko ry Mpamonjy (FFPM 470)",//297
    "Zanahary tsy mba tia (FFPM 28)",//298
    "Ô Ry malahelo",//299
    "Ô! Ray Malala asehoy",//300
    "Jesosy nijaly tao Gestemane",//301
    "Harena sy fananako",//302
    "Misaotra misaotra Jesoa",//303
    "Tompo ô Tsy takatry ny saiko (FFPM 451)",//304 Texte mifanindry
    "Efa trotraky ny adin-tsaina",//305
    "Bientôt très  bientôt",//306
    "Na dia tezitra aza satana",//307 Texte mifanindry
    "Saotra sy dera",//308
    "Maranatha",//309
    "Kanto loatra",//310
    "Mifankatiava e",//311
    "Izy anie no omem-boninahitra",//312
    "Fa tsara Ianao",//313
    "Tsy misy reharehako",//314
    "Je n'ai que Toi",//315
    "Hira fiderana",//316
    "Jamba aho teo aloha, mahiratra aho ...",//317
    "Célébrez Jesus ,célébrez",//318
    "Jehovah ô,derainay Hianao",//319
    "Mahafinaritra be ny miaraka amin'i Jesoa",//320
    "Deraina ny anaran'ny Tompo",//321
    "Deraina ny anaranao",//322
    "Ny teninao",//323
    "Mahafinaritra ny Tompo",//324
    "Derao ny Tompo",//325
    "E liake",//326
    "Tsy lakana ny lakana raha toa",//327
    "Andriamanitra mahery ny Andriamanitray",//328
    "Hafatry ny lanitra",//329
    "Lalana volamena",//330
    "Misy lalana",//331
    "Fiderana makotrokotroka",//332
    "Taona maro",//333
    "Hanaraka Anao aho",//334
    "Lehibe ny Andriamanitrao e",//335
    "He ravoravo ny fo",//336
    "Eo amin' ny fiainana",//337
    "Efa resin'i Jesosy",//338
    "Deraina ny anaranao",//339
    "Jesosy irery",//340
    "Tefeo",//341
    "Aleoko ny ahy",//342
    "Deraina Jesosy",//343
    "He tsara ny tanànanay",//344
    "Mahafinaritra Ianao Jesoa",//345
    "Adidin' i Jehovah",//346
    "Omeo ahy ny Tompo ô!",//347
    "Kely sisa",//348
    "Ny fitahiany dia ho ahy",//349
    "Miorena",//350
    "Tsy maintsy",//351
    "Voninahitra",//352
    "Tomady e",//353
    "Manatrika eto",//354
    "Bon courage",//355
    "Ekeko 100%",//356
    "Tiako loatra",//357
    "Zay mitady an'i Jehovah",//358
    "Tsy maintsy midera aho",//359
    "Ny herinao Tompo ô!",//360
    "Mamiko Ianao Ray ô!",//361
    "Tokim-panompoana",//362
    "Masina",//363
    "Anao ny fiderana",//364
    "Itafio Kristy",//365
    "Fo miray",//366
    "Mba raiso aho Jesosy",//367
    "Voninahitra ho an' Andriamanitra",//368
    "Derain' ny olo-masina",//369
    "Izaho mintsy Tompo",//370
    "Ho antsika mandresy",//371
    "Mahafinaritra Ianao",//372
    "Ireto mpivady Ray ô!",//373
    "Tsara ny Tompo",//374
    "Dera, laza, haleloia (Gloire, gloire) ",//375
    "Kumbaya",//376
    "Tanteraka avokoa",//377
    "Ilay masoandron' Andriamanitra",//378
    "Ny taratry ny fandresena",//379
    "Anao ny dera, saotra ,hery",//380
    "HO an' ny znak' ondry izay manjaka",//381
    "Tsy hitsahatra hidera anao ny foko",//382
    "Ny voninahitr' Andriamanitra Ray",//383
    "Maro ireo tanora izay miraparapa",//384
    "Efa voadinikao Andriamanitra (FJKM)",//385
    "Raha mbola Izy no Andriamanitra",//386
    "Hanaraka Anao",//387
    "Vory eto izahay (fihirana Katolika)",//388
    "Mandohalika",//389
    "Zanahary ô tahio",//390
    "Hitahy anareo",//391
    "Ny teninao Andriamanitra ô!(F Katolika)",//392
    "Endrey mba mahafinaritra lotra (F Katolika)",//393
    "Ny fahasoavan'ny Tompo",//394
    "Derao, Derao Jeso",//395
    "Fo torotoro (F Katolika)",//396
    "Olombelona aho Tompo (F Katolika)",//397
    "Nous t' adorons",//398
    "Aza avela hahalala (FF 32)",//399
    "Fo mitambatra",//400
    "Ambany elatrao",//401
    "Havaozy ny foko",//402
    "Mba tantanonao ry Raiko",//403
    "Masoko manganohano",//404
    "Jeso vato fehizoro",//405
    "Raha Jehovah no Mpiandry",//406
    "Tsy mba hisy reharehako (FF 29)",//407
    "Mpiara-miasa amin' Andriamanitra",//408
    "Hiara-hivavaka isika",//409
    "FIderana",//410
    "Hihira aho",//411
    "Tantano",//412
    "Noho Ilay tompoiko",//413
    "Deraina ny anaranao",//414
    "Asandratray ny anaranao",//415
    "Haleloia Hosana",//416
    "Moramora",//417
    " Tsara ny Midera",//418
    "Avia manantona",//419
    "Adandratray Ianao",//420
    "Raha te ho sambatra",//421
    "Mahereza, aza osa",//422
    "Tsy hitsahatra hidera (F Katolika)",//423
    "Ny voninahitr' Andriamanitra Ray",//424
    "Miverena ianao ry mpanota ô!",//425
    "Tsara ny mankalaza",//426
    "Hira veloma",//427
    "Misandrata",//428

)
