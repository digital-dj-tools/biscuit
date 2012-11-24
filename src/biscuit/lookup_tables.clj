(ns biscuit.lookup-tables)

(def crc8-1wire
  [0x00 0x5e 0xbc 0xe2 0x61 0x3f 0xdd 0x83 0xc2 0x9c 0x7e 0x20 0xa3 0xfd 0x1f 0x41 0x9d 0xc3 0x21 0x7f 0xfc 0xa2 0x40 0x1e 0x5f 0x01 0xe3 0xbd 0x3e 0x60 0x82 0xdc 0x23 0x7d 0x9f 0xc1 0x42 0x1c 0xfe 0xa0 0xe1 0xbf 0x5d 0x03 0x80 0xde 0x3c 0x62 0xbe 0xe0 0x02 0x5c 0xdf 0x81 0x63 0x3d 0x7c 0x22 0xc0 0x9e 0x1d 0x43 0xa1 0xff 0x46 0x18 0xfa 0xa4 0x27 0x79 0x9b 0xc5 0x84 0xda 0x38 0x66 0xe5 0xbb 0x59 0x07 0xdb 0x85 0x67 0x39 0xba 0xe4 0x06 0x58 0x19 0x47 0xa5 0xfb 0x78 0x26 0xc4 0x9a 0x65 0x3b 0xd9 0x87 0x04 0x5a 0xb8 0xe6 0xa7 0xf9 0x1b 0x45 0xc6 0x98 0x7a 0x24 0xf8 0xa6 0x44 0x1a 0x99 0xc7 0x25 0x7b 0x3a 0x64 0x86 0xd8 0x5b 0x05 0xe7 0xb9 0x8c 0xd2 0x30 0x6e 0xed 0xb3 0x51 0x0f 0x4e 0x10 0xf2 0xac 0x2f 0x71 0x93 0xcd 0x11 0x4f 0xad 0xf3 0x70 0x2e 0xcc 0x92 0xd3 0x8d 0x6f 0x31 0xb2 0xec 0x0e 0x50 0xaf 0xf1 0x13 0x4d 0xce 0x90 0x72 0x2c 0x6d 0x33 0xd1 0x8f 0x0c 0x52 0xb0 0xee 0x32 0x6c 0x8e 0xd0 0x53 0x0d 0xef 0xb1 0xf0 0xae 0x4c 0x12 0x91 0xcf 0x2d 0x73 0xca 0x94 0x76 0x28 0xab 0xf5 0x17 0x49 0x08 0x56 0xb4 0xea 0x69 0x37 0xd5 0x8b 0x57 0x09 0xeb 0xb5 0x36 0x68 0x8a 0xd4 0x95 0xcb 0x29 0x77 0xf4 0xaa 0x48 0x16 0xe9 0xb7 0x55 0x0b 0x88 0xd6 0x34 0x6a 0x2b 0x75 0x97 0xc9 0x4a 0x14 0xf6 0xa8 0x74 0x2a 0xc8 0x96 0x15 0x4b 0xa9 0xf7 0xb6 0xe8 0x0a 0x54 0xd7 0x89 0x6b 0x35])

(def crc8
  [0x00 0x07 0x0e 0x09 0x1c 0x1b 0x12 0x15 0x38 0x3f 0x36 0x31 0x24 0x23 0x2a 0x2d 0x70 0x77 0x7e 0x79 0x6c 0x6b 0x62 0x65 0x48 0x4f 0x46 0x41 0x54 0x53 0x5a 0x5d 0xe0 0xe7 0xee 0xe9 0xfc 0xfb 0xf2 0xf5 0xd8 0xdf 0xd6 0xd1 0xc4 0xc3 0xca 0xcd 0x90 0x97 0x9e 0x99 0x8c 0x8b 0x82 0x85 0xa8 0xaf 0xa6 0xa1 0xb4 0xb3 0xba 0xbd 0xc7 0xc0 0xc9 0xce 0xdb 0xdc 0xd5 0xd2 0xff 0xf8 0xf1 0xf6 0xe3 0xe4 0xed 0xea 0xb7 0xb0 0xb9 0xbe 0xab 0xac 0xa5 0xa2 0x8f 0x88 0x81 0x86 0x93 0x94 0x9d 0x9a 0x27 0x20 0x29 0x2e 0x3b 0x3c 0x35 0x32 0x1f 0x18 0x11 0x16 0x03 0x04 0x0d 0x0a 0x57 0x50 0x59 0x5e 0x4b 0x4c 0x45 0x42 0x6f 0x68 0x61 0x66 0x73 0x74 0x7d 0x7a 0x89 0x8e 0x87 0x80 0x95 0x92 0x9b 0x9c 0xb1 0xb6 0xbf 0xb8 0xad 0xaa 0xa3 0xa4 0xf9 0xfe 0xf7 0xf0 0xe5 0xe2 0xeb 0xec 0xc1 0xc6 0xcf 0xc8 0xdd 0xda 0xd3 0xd4 0x69 0x6e 0x67 0x60 0x75 0x72 0x7b 0x7c 0x51 0x56 0x5f 0x58 0x4d 0x4a 0x43 0x44 0x19 0x1e 0x17 0x10 0x05 0x02 0x0b 0x0c 0x21 0x26 0x2f 0x28 0x3d 0x3a 0x33 0x34 0x4e 0x49 0x40 0x47 0x52 0x55 0x5c 0x5b 0x76 0x71 0x78 0x7f 0x6a 0x6d 0x64 0x63 0x3e 0x39 0x30 0x37 0x22 0x25 0x2c 0x2b 0x06 0x01 0x08 0x0f 0x1a 0x1d 0x14 0x13 0xae 0xa9 0xa0 0xa7 0xb2 0xb5 0xbc 0xbb 0x96 0x91 0x98 0x9f 0x8a 0x8d 0x84 0x83 0xde 0xd9 0xd0 0xd7 0xc2 0xc5 0xcc 0xcb 0xe6 0xe1 0xe8 0xef 0xfa 0xfd 0xf4 0xf3])

(def crc16
  [0x0000 0xc0c1 0xc181 0x0140 0xc301 0x03c0 0x0280 0xc241 0xc601 0x06c0 0x0780 0xc741 0x0500 0xc5c1 0xc481 0x0440 0xcc01 0x0cc0 0x0d80 0xcd41 0x0f00 0xcfc1 0xce81 0x0e40 0x0a00 0xcac1 0xcb81 0x0b40 0xc901 0x09c0 0x0880 0xc841 0xd801 0x18c0 0x1980 0xd941 0x1b00 0xdbc1 0xda81 0x1a40 0x1e00 0xdec1 0xdf81 0x1f40 0xdd01 0x1dc0 0x1c80 0xdc41 0x1400 0xd4c1 0xd581 0x1540 0xd701 0x17c0 0x1680 0xd641 0xd201 0x12c0 0x1380 0xd341 0x1100 0xd1c1 0xd081 0x1040 0xf001 0x30c0 0x3180 0xf141 0x3300 0xf3c1 0xf281 0x3240 0x3600 0xf6c1 0xf781 0x3740 0xf501 0x35c0 0x3480 0xf441 0x3c00 0xfcc1 0xfd81 0x3d40 0xff01 0x3fc0 0x3e80 0xfe41 0xfa01 0x3ac0 0x3b80 0xfb41 0x3900 0xf9c1 0xf881 0x3840 0x2800 0xe8c1 0xe981 0x2940 0xeb01 0x2bc0 0x2a80 0xea41 0xee01 0x2ec0 0x2f80 0xef41 0x2d00 0xedc1 0xec81 0x2c40 0xe401 0x24c0 0x2580 0xe541 0x2700 0xe7c1 0xe681 0x2640 0x2200 0xe2c1 0xe381 0x2340 0xe101 0x21c0 0x2080 0xe041 0xa001 0x60c0 0x6180 0xa141 0x6300 0xa3c1 0xa281 0x6240 0x6600 0xa6c1 0xa781 0x6740 0xa501 0x65c0 0x6480 0xa441 0x6c00 0xacc1 0xad81 0x6d40 0xaf01 0x6fc0 0x6e80 0xae41 0xaa01 0x6ac0 0x6b80 0xab41 0x6900 0xa9c1 0xa881 0x6840 0x7800 0xb8c1 0xb981 0x7940 0xbb01 0x7bc0 0x7a80 0xba41 0xbe01 0x7ec0 0x7f80 0xbf41 0x7d00 0xbdc1 0xbc81 0x7c40 0xb401 0x74c0 0x7580 0xb541 0x7700 0xb7c1 0xb681 0x7640 0x7200 0xb2c1 0xb381 0x7340 0xb101 0x71c0 0x7080 0xb041 0x5000 0x90c1 0x9181 0x5140 0x9301 0x53c0 0x5280 0x9241 0x9601 0x56c0 0x5780 0x9741 0x5500 0x95c1 0x9481 0x5440 0x9c01 0x5cc0 0x5d80 0x9d41 0x5f00 0x9fc1 0x9e81 0x5e40 0x5a00 0x9ac1 0x9b81 0x5b40 0x9901 0x59c0 0x5880 0x9841 0x8801 0x48c0 0x4980 0x8941 0x4b00 0x8bc1 0x8a81 0x4a40 0x4e00 0x8ec1 0x8f81 0x4f40 0x8d01 0x4dc0 0x4c80 0x8c41 0x4400 0x84c1 0x8581 0x4540 0x8701 0x47c0 0x4680 0x8641 0x8201 0x42c0 0x4380 0x8341 0x4100 0x81c1 0x8081 0x4040])

(def crc24
  [0x000000 0x864cfb 0x8ad50d 0x0c99f6 0x93e6e1 0x15aa1a 0x1933ec 0x9f7f17 0xa18139 0x27cdc2 0x2b5434 0xad18cf 0x3267d8 0xb42b23 0xb8b2d5 0x3efe2e 0xc54e89 0x430272 0x4f9b84 0xc9d77f 0x56a868 0xd0e493 0xdc7d65 0x5a319e 0x64cfb0 0xe2834b 0xee1abd 0x685646 0xf72951 0x7165aa 0x7dfc5c 0xfbb0a7 0x0cd1e9 0x8a9d12 0x8604e4 0x00481f 0x9f3708 0x197bf3 0x15e205 0x93aefe 0xad50d0 0x2b1c2b 0x2785dd 0xa1c926 0x3eb631 0xb8faca 0xb4633c 0x322fc7 0xc99f60 0x4fd39b 0x434a6d 0xc50696 0x5a7981 0xdc357a 0xd0ac8c 0x56e077 0x681e59 0xee52a2 0xe2cb54 0x6487af 0xfbf8b8 0x7db443 0x712db5 0xf7614e 0x19a3d2 0x9fef29 0x9376df 0x153a24 0x8a4533 0x0c09c8 0x00903e 0x86dcc5 0xb822eb 0x3e6e10 0x32f7e6 0xb4bb1d 0x2bc40a 0xad88f1 0xa11107 0x275dfc 0xdced5b 0x5aa1a0 0x563856 0xd074ad 0x4f0bba 0xc94741 0xc5deb7 0x43924c 0x7d6c62 0xfb2099 0xf7b96f 0x71f594 0xee8a83 0x68c678 0x645f8e 0xe21375 0x15723b 0x933ec0 0x9fa736 0x19ebcd 0x8694da 0x00d821 0x0c41d7 0x8a0d2c 0xb4f302 0x32bff9 0x3e260f 0xb86af4 0x2715e3 0xa15918 0xadc0ee 0x2b8c15 0xd03cb2 0x567049 0x5ae9bf 0xdca544 0x43da53 0xc596a8 0xc90f5e 0x4f43a5 0x71bd8b 0xf7f170 0xfb6886 0x7d247d 0xe25b6a 0x641791 0x688e67 0xeec29c 0x3347a4 0xb50b5f 0xb992a9 0x3fde52 0xa0a145 0x26edbe 0x2a7448 0xac38b3 0x92c69d 0x148a66 0x181390 0x9e5f6b 0x01207c 0x876c87 0x8bf571 0x0db98a 0xf6092d 0x7045d6 0x7cdc20 0xfa90db 0x65efcc 0xe3a337 0xef3ac1 0x69763a 0x578814 0xd1c4ef 0xdd5d19 0x5b11e2 0xc46ef5 0x42220e 0x4ebbf8 0xc8f703 0x3f964d 0xb9dab6 0xb54340 0x330fbb 0xac70ac 0x2a3c57 0x26a5a1 0xa0e95a 0x9e1774 0x185b8f 0x14c279 0x928e82 0x0df195 0x8bbd6e 0x872498 0x016863 0xfad8c4 0x7c943f 0x700dc9 0xf64132 0x693e25 0xef72de 0xe3eb28 0x65a7d3 0x5b59fd 0xdd1506 0xd18cf0 0x57c00b 0xc8bf1c 0x4ef3e7 0x426a11 0xc426ea 0x2ae476 0xaca88d 0xa0317b 0x267d80 0xb90297 0x3f4e6c 0x33d79a 0xb59b61 0x8b654f 0x0d29b4 0x01b042 0x87fcb9 0x1883ae 0x9ecf55 0x9256a3 0x141a58 0xefaaff 0x69e604 0x657ff2 0xe33309 0x7c4c1e 0xfa00e5 0xf69913 0x70d5e8 0x4e2bc6 0xc8673d 0xc4fecb 0x42b230 0xddcd27 0x5b81dc 0x57182a 0xd154d1 0x26359f 0xa07964 0xace092 0x2aac69 0xb5d37e 0x339f85 0x3f0673 0xb94a88 0x87b4a6 0x01f85d 0x0d61ab 0x8b2d50 0x145247 0x921ebc 0x9e874a 0x18cbb1 0xe37b16 0x6537ed 0x69ae1b 0xefe2e0 0x709df7 0xf6d10c 0xfa48fa 0x7c0401 0x42fa2f 0xc4b6d4 0xc82f22 0x4e63d9 0xd11cce 0x575035 0x5bc9c3 0xdd8538])

(def crc32
  [0x00000000, 0x77073096, 0xee0e612c, 0x990951ba, 0x076dc419, 0x706af48f, 0xe963a535, 0x9e6495a3, 0x0edb8832, 0x79dcb8a4, 0xe0d5e91e, 0x97d2d988, 0x09b64c2b, 0x7eb17cbd, 0xe7b82d07, 0x90bf1d91, 0x1db71064, 0x6ab020f2, 0xf3b97148, 0x84be41de, 0x1adad47d, 0x6ddde4eb, 0xf4d4b551, 0x83d385c7, 0x136c9856, 0x646ba8c0, 0xfd62f97a, 0x8a65c9ec, 0x14015c4f, 0x63066cd9, 0xfa0f3d63, 0x8d080df5, 0x3b6e20c8, 0x4c69105e, 0xd56041e4, 0xa2677172, 0x3c03e4d1, 0x4b04d447, 0xd20d85fd, 0xa50ab56b, 0x35b5a8fa, 0x42b2986c, 0xdbbbc9d6, 0xacbcf940, 0x32d86ce3, 0x45df5c75, 0xdcd60dcf, 0xabd13d59, 0x26d930ac, 0x51de003a, 0xc8d75180, 0xbfd06116, 0x21b4f4b5, 0x56b3c423, 0xcfba9599, 0xb8bda50f, 0x2802b89e, 0x5f058808, 0xc60cd9b2, 0xb10be924, 0x2f6f7c87, 0x58684c11, 0xc1611dab, 0xb6662d3d, 0x76dc4190, 0x01db7106, 0x98d220bc, 0xefd5102a, 0x71b18589, 0x06b6b51f, 0x9fbfe4a5, 0xe8b8d433, 0x7807c9a2, 0x0f00f934, 0x9609a88e, 0xe10e9818, 0x7f6a0dbb, 0x086d3d2d, 0x91646c97, 0xe6635c01, 0x6b6b51f4, 0x1c6c6162, 0x856530d8, 0xf262004e, 0x6c0695ed, 0x1b01a57b, 0x8208f4c1, 0xf50fc457, 0x65b0d9c6, 0x12b7e950, 0x8bbeb8ea, 0xfcb9887c, 0x62dd1ddf, 0x15da2d49, 0x8cd37cf3, 0xfbd44c65, 0x4db26158, 0x3ab551ce, 0xa3bc0074, 0xd4bb30e2, 0x4adfa541, 0x3dd895d7, 0xa4d1c46d, 0xd3d6f4fb, 0x4369e96a, 0x346ed9fc, 0xad678846, 0xda60b8d0, 0x44042d73, 0x33031de5, 0xaa0a4c5f, 0xdd0d7cc9, 0x5005713c, 0x270241aa, 0xbe0b1010, 0xc90c2086, 0x5768b525, 0x206f85b3, 0xb966d409, 0xce61e49f, 0x5edef90e, 0x29d9c998, 0xb0d09822, 0xc7d7a8b4, 0x59b33d17, 0x2eb40d81, 0xb7bd5c3b, 0xc0ba6cad, 0xedb88320, 0x9abfb3b6, 0x03b6e20c, 0x74b1d29a, 0xead54739, 0x9dd277af, 0x04db2615, 0x73dc1683, 0xe3630b12, 0x94643b84, 0x0d6d6a3e, 0x7a6a5aa8, 0xe40ecf0b, 0x9309ff9d, 0x0a00ae27, 0x7d079eb1, 0xf00f9344, 0x8708a3d2, 0x1e01f268, 0x6906c2fe, 0xf762575d, 0x806567cb, 0x196c3671, 0x6e6b06e7, 0xfed41b76, 0x89d32be0, 0x10da7a5a, 0x67dd4acc, 0xf9b9df6f, 0x8ebeeff9, 0x17b7be43, 0x60b08ed5, 0xd6d6a3e8, 0xa1d1937e, 0x38d8c2c4, 0x4fdff252, 0xd1bb67f1, 0xa6bc5767, 0x3fb506dd, 0x48b2364b, 0xd80d2bda, 0xaf0a1b4c, 0x36034af6, 0x41047a60, 0xdf60efc3, 0xa867df55, 0x316e8eef, 0x4669be79, 0xcb61b38c, 0xbc66831a, 0x256fd2a0, 0x5268e236, 0xcc0c7795, 0xbb0b4703, 0x220216b9, 0x5505262f, 0xc5ba3bbe, 0xb2bd0b28, 0x2bb45a92, 0x5cb36a04, 0xc2d7ffa7, 0xb5d0cf31, 0x2cd99e8b, 0x5bdeae1d, 0x9b64c2b0, 0xec63f226, 0x756aa39c, 0x026d930a, 0x9c0906a9, 0xeb0e363f, 0x72076785, 0x05005713, 0x95bf4a82, 0xe2b87a14, 0x7bb12bae, 0x0cb61b38, 0x92d28e9b, 0xe5d5be0d, 0x7cdcefb7, 0x0bdbdf21, 0x86d3d2d4, 0xf1d4e242, 0x68ddb3f8, 0x1fda836e, 0x81be16cd, 0xf6b9265b, 0x6fb077e1, 0x18b74777, 0x88085ae6, 0xff0f6a70, 0x66063bca, 0x11010b5c, 0x8f659eff, 0xf862ae69, 0x616bffd3, 0x166ccf45, 0xa00ae278, 0xd70dd2ee, 0x4e048354, 0x3903b3c2, 0xa7672661, 0xd06016f7, 0x4969474d, 0x3e6e77db, 0xaed16a4a, 0xd9d65adc, 0x40df0b66, 0x37d83bf0, 0xa9bcae53, 0xdebb9ec5, 0x47b2cf7f, 0x30b5ffe9, 0xbdbdf21c, 0xcabac28a, 0x53b39330, 0x24b4a3a6, 0xbad03605, 0xcdd70693, 0x54de5729, 0x23d967bf, 0xb3667a2e, 0xc4614ab8, 0x5d681b02, 0x2a6f2b94, 0xb40bbe37, 0xc30c8ea1, 0x5a05df1b, 0x2d02ef8d])
